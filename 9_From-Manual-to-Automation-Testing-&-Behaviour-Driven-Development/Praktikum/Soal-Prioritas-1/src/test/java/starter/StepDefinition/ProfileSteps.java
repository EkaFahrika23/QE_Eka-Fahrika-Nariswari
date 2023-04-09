package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitures.Profile;

public class ProfileSteps {
    @Steps
    Profile profile;

    @Given("user access the LinkedIn Application")
    public void accessTheAccount(){
        profile.accessTheAccount();

    }
    @When("user clicks on their profile picture")
    public void clickProfilePicture(){
        profile.clickProfilePicture();
    }
    @Then("user will be redirected to their profile page")
    public void redirectedProfilePage(){
        profile.redirectedProfilePage();
    }
    @And("user can view their basic information, work experience, education and other relevant details")
    public void viewProfile(){
        profile.viewProfile();
    }
}
