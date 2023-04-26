package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.screenplay.rest.interactions.Put;
import org.json.simple.JSONObject;

import java.util.List;
import java.util.Map;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;

public class APIStepDefinisions {

    String baseURL =  "https://fakestoreapi.com";

    @Given("{actor} call an api {string} with method {string}")
    public void callApi(Actor actor, String path, String method, DataTable table){
        actor.whoCan(CallAnApi.at(baseURL));
        switch (method){
            case "GET":
                actor.attemptsTo(Get.resource(path));
                break;
            case "POST":
                actor.attemptsTo(Post.to(path));
                if (!table.isEmpty()){
                    JSONObject bodyRequest = new JSONObject();
                    List<Map<String, String>> rows = table.asMaps(String.class, String.class);
                    for (Map<String, String> columns : rows) {
                        bodyRequest.put("username", columns.get("username"));
                        bodyRequest.put("password", columns.get("password"));
                    }
                    actor.attemptsTo(Post.to(path).with(request -> request.body(bodyRequest)));
                } else {
                    actor.attemptsTo(Post.to(path));
                }
                break;
            case "PUT":
                actor.attemptsTo(Put.to(path));
                break;
            case  "DELETE":
                actor.attemptsTo(Delete.from(path));
                break;
            default:
                throw new IllegalStateException("Unknow Method");
        }
    }

    @Then("{actor} verify {string} is exist")
    public void userVerifyIsExist(Actor actor, String data) {
        Response response = SerenityRest.lastResponse();
        response.then().body(data, not(emptyString()));
    }

    @Then("{actor} verify response is match with json schema {string}")
    public void userVerifyResponseIsMatchWithJsonSchema(String schema) {
        Response response = SerenityRest.lastResponse();
        response.then().body(matchesJsonSchemaInClasspath(schema));
    }

    @Then("{actor} verify status code is {int}")
    public void userVerifyStatusCodeIs(Actor actor, int statusCode) {
        Response response = SerenityRest.lastResponse();
        response.then().statusCode(statusCode);
    }

    @Given("{actor} login to api {string} with username {string} and password {string}")
    public void userLoginToApiWithUsernameAndPassword(Actor actor, String path, String username, String password) {
        actor.attemptsTo(Post.to(path).with(request -> request.body(String.format("{\"username\": \"%s\",\"password\": \"%s\"}", username,password))));
    }

}
