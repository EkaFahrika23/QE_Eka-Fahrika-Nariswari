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
    @When("I am input valid email")
    public void inputValidEmail(){
        loginPage.inputEmail("ekapahrika23@gmail.com");

    }
    @And("I am input valid password")
    public void inputValidPassword(){
        loginPage.inputPassword("maheswara21");

    }
    @Then("I am click login button")
    public void clickLoginButton(){
        loginPage.clickLoginButton();

    }

}
