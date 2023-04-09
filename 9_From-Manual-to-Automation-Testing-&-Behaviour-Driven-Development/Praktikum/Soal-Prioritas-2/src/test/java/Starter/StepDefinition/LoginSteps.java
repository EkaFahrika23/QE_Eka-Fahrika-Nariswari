package Starter.StepDefinition;

import Starter.features.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginSteps {

    @Steps
    Login login;

    @Given("user on the login page")
    public void onTheLoginPage(){
        login.onTheLoginPage();

    }
    @When("user enter valid number phone or email and password")
    public void enterValidation(){
        login.enterValidation();
    }
    @Then("user click login button")
    public void clickLoginButton(){
        login.clickLoginButton();
    }
    @And("user can see home page to be transactions there")
    public void successLogin(){
        login.successLogin();
    }
    @Given("user navigate to login page")
    public void accessLoginPage(){
        login.accessLoginPage();
    }
    @When("user enter the invalid email")
    public void enterInvalidEmail(){
        login.enterInvalidEmail();
    }
    @Then("an error message is displayed indicating that the email address is invalid")
    public void errorInvalidEmail(){
        login.errorInvalidEmail();
    }
    @Given("a user navigate to login page")
    public void onTheLogin(){
        login.onTheLogin();
    }
    @When("user enter the invalid number phone")
    public void enterInvalidPhone(){
        login.enterInvalidPhone();
    }
    @Then("an error message is displayed indicating that the number phone is invalid")
    public void errorInvalidPhone(){
        login.errorInvalidPhone();
    }
    @Given("a user navigates to the login page")
    public void navigateToLogin(){
        login.navigateToLogin();
    }
    @When("the user enters a valid email address or number phone and an incorrect password")
    public void enterIncorrectPassword(){
        login.enterIncorrectPassword();
    }
    @Then("an error message is displayed indicating that the password")
    public void errorIncorrectPassword(){
        login.errorIncorrectPassword();
    }
}
