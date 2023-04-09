package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Put {

    protected String url = "https://jsonplaceholder.typicode.com/posts";

    @Step("I set PUT api endpoints")
    public String setPutApiEndpoint() {
        return url + "/1";
    }
    @Step("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "as sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
        requestBody.put("body", "equ quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutApiEndpoint());
    }

    @Step("I receive valid data for updated user")
    public void validDataUpdateUser(){
        restAssuredThat(response -> response.body("'title'", equalTo("as sunt aut facere repellat provident occaecati excepturi optio reprehenderit")));
        restAssuredThat(response -> response.body("'body'", equalTo("equ quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto")));
    }


}