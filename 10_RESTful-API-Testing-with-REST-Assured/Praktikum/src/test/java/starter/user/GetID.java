package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetID {

    protected static String url = "https://jsonplaceholder.typicode.com/posts";
    @Step("I set GET api endpoints")
    public String setApiIDEndpoint(){
        return url + "/1";
    }

    @Step("I set GET HTTP request")
    public void sendGetIdHttpRequest(){
        SerenityRest.given().get(setApiIDEndpoint());
    }

    @Step("I have receive valid HTTP response code 200")
    public void haveValidateHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for detail user")
    public void validateDataDetailUser(){
        restAssuredThat(response -> response.body("'id'",equalTo(1)));
        restAssuredThat(response -> response.body("'title'",equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")));}

}
