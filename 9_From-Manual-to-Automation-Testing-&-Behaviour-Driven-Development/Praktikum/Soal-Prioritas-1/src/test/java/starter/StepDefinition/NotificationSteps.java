package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitures.Notification;

public class NotificationSteps {
    @Steps
    Notification notification;

    @Given("user login to linkedIn account")
    public void loginToAccount(){
        notification.loginToAccount();

    }
    @When("another user interacts with their profile, such as liking or commenting on a post, sending a connection request or endorsing a skill")
    public void anotherUserInteracts(){
        notification.anotherUserInteracts();
    }
    @Then("user will receive a notification about the interaction")
    public void receiveNotification(){
        notification.receiveNotification();
    }
    @And("user can be viewed by clicking on the notification icon on the top right corner of the screen")
    public void viewedNotification(){
        notification.viewedNotification();

    }
}
