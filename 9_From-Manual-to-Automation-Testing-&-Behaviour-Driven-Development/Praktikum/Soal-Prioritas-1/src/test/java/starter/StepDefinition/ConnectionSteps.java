package starter.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitures.Connection;

public class ConnectionSteps {

    @Steps
    Connection connection;

    @Given("user on the connection page")
    public void onTheConnectionPage(){
        connection.onTheConnectionPage();

    }
    @When("user searches for a specific person or views a suggested connection and decides to connect with them")
    public void searchPerson(){
        connection.searchPerson();

    }
    @Then("user can click on the \"Connect\" button and send a personalized connection request to the selected person")
    public void clickConnect(){
        connection.clickConnect();

    }
    @Given("user has one or more pending connection requests")
    public void hasPendingConnection(){
        connection.hasPendingConnection();
    }
    @When("user clicks on the \"My Network\" icon on the top right corner of the screen and selects \"Pending Invitations\"")
    public void clickMyNetwork(){
        connection.clickMyNetwork();
    }
    @Then("user can view their pending connection requests and click on the \"Accept\" button")
    public void AcceptButton(){
        connection.AcceptButton();
    }
    @Given("user has pending connection requests")
    public void hasConnectionRequest(){
        connection.hasConnectionRequest();
    }
    @When("user clicks on the \"My Network\" icon and selects \"Pending Invitations\"")
    public void PendingInvitations(){
        connection.PendingInvitations();
    }
    @Then("user can view their pending connection requests and click on the \"Ignore\" button")
    public void clickIgnoreButton(){
        connection.clickIgnoreButton();
    }
}
