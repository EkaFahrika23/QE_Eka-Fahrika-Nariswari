package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitures.SignUp;

public class SignUpSteps {
    @Steps
    SignUp SignUp;

    @Given("the user on the sign up page")
    public void onTheSignUpPage(){
        SignUp.onTheSignUpPage();
    }
    @When("the user fills the valid details")
    public void fillsTheValidDetails(){
        SignUp.fillsTheValidDetails();
    }
    @Then("the user should be redirected to their LinkedIn home page")
    public void shouldBeRedirected(){
        SignUp.shouldBeRedirected();
    }
    @And("a confirmation email should be sent to the user's email address")
    public void confirmationEmail(){
        SignUp.confirmationEmail();
    }
}
