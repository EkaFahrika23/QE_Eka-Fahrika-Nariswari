package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Post {
    protected String url = "https://jsonplaceholder.typicode.com/posts";
    @Step("I set POST api endpoints")
    public String setPostApiEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request")
    public void sendPostHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "I want to eat");
        requestBody.put("body", "should buy some many food");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }

    @Step("I receive valid HTTP response code 201")
    public void receiveHttpResponseCode201(){
        restAssuredThat(respone -> respone.statusCode(201));
    }

    @Step("I receive valid data for new user")
    public void validateDataNewUser(){
        restAssuredThat(response -> response.body("'title'", equalTo("I want to eat")));
        restAssuredThat(response -> response.body("'body'", equalTo("should buy some many food")));
    }
}
