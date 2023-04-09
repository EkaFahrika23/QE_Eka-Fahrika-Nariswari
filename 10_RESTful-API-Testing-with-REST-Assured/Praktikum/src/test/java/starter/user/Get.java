package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class Get {

    protected static String url = "https://jsonplaceholder.typicode.com/posts";
    @Step("I set GET api endpoints")
    public String setApiEndpoint(){
        return url;
    }

    @Step("I set GET HTTP request")
    public void sendGetHttpRequest(){
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

}
