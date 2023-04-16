package Starter.StepDefinitions;

import Starter.Pages.HomePage;
import Starter.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Given("I am on the login page")
    public void onTheLoginPage(){
        loginPage.openPage();
        loginPage.validateOnLoginPage();

    }
    @When("I input valid username")
    public void inputValidUsername(){
        loginPage.inputUsername("standard_user");

    }
    @And("I input valid password")
    public void inputValidPassword(){
        loginPage.inputPassword("secret_sauce");

    }
    @And("I click login button")
    public void clickLoginButton(){
        loginPage.ClickLoginButton();

    }
    @Then("I am on the home page")
    public void onTheHomePage(){
        homePage.validateHomePage();

    }
}
