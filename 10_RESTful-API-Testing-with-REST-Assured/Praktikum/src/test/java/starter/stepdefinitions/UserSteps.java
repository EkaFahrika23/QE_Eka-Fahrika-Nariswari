package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Get;
import starter.user.GetID;
import starter.user.Post;
import starter.user.Put;

public class UserSteps {
    @Steps
    Get get;

    @Steps
    Post post;

    @Steps
    GetID getID;

    @Steps
    Put put;

    @Given("I set GET api endpoints")
    public void setGetApiEndpoints(){
        get.setApiEndpoint();
    }
    @When("I set GET HTTP request")
    public void sendGetHttpRequest(){
        get.sendGetHttpRequest();
    }
    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponse(){
        get.validateHttpResponseCode200();
    }

    @Given("I set POST api endpoints")
    public void setPostApiEndpoint(){
        post.setPostApiEndpoint();
    }

    @When("I send POST HTTP request")
    public void sendPostHttpRequest(){
        post.sendPostHttpRequest();
    }

    @Then("I receive valid HTTP response code 201")
    public void receiveValidHttp201(){
        post.receiveHttpResponseCode201();
    }
    @And("I receive valid data for new user")
    public void validateDataNewUser(){
        post.validateDataNewUser();
    }

    @Given("I set GET ID api endpoints")
    public void setApiIDEndpoint(){
        getID.setApiIDEndpoint();
    }

    @When("I set GET ID HTTP request")
    public void sendGetIdHttpRequest(){
        getID.sendGetIdHttpRequest();
    }

    @Then("I have receive valid HTTP response code 200")
    public void haveValidateHttpResponseCode200(){
        getID.haveValidateHttpResponseCode200();
    }

    @And("I receive valid detail user")
    public void validateDataDetailUser(){
        getID.validateDataDetailUser();
    }

    @Given("I set PUT api endpoints")
    public void setPutApiEndpoints(){
        put.setPutApiEndpoint();
    }

    @When("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        put.sendPutHttpRequest();
    }

    @And("I receive valid data for updated user")
    public void validDataUpdateUser(){
        put.validDataUpdateUser();
    }

    @Given("I set DELETE api endpoints")
    public void setDeleteApiEndpoints(){

    }
    @When("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){

    }
    @Then("I receive valid HTTP response code 204")
    public void validHttpResponseCode204(){

    }
}
