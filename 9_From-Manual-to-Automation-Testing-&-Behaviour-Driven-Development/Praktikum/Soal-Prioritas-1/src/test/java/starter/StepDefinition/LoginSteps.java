package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitures.Login;

public class LoginSteps {
        @Steps
        Login login;

        @Given("I am on the sign in page")
        public void onTheSignInPage() {
            login.onTheSignInPage();
        }

        @When("I enter my email or phone number and password correctly")
        public void enterValidCredentials() {
            login.enterValidCredentials();
        }

        @And("I click sign in button")
        public void clickSignInButton() {
            login.clickSignInButton();
        }

        @Then("I am on the LinkedIn home page")
        public void onTheHomePage() {
            login.onTheHomePage();
        }
    }
