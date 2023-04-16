package Starter.StepDefinitions;

import Starter.Pages.AllProductPage;
import Starter.Pages.HomePage;
import Starter.Pages.TransactionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class productSteps {
    @Steps
    HomePage homePage;

    @Steps
    AllProductPage allProductPage;

    @Steps
    TransactionPage transactionPage;

    @Given("I am on Home Page")
    public void onHomePage(){
        homePage.validateHomePage();

    }
    @When("I am click all product button")
    public void clickAllProduct(){
        homePage.ProductButton();

    }
    @And("I see all the product")
    public void seeAllTheProduct(){
        allProductPage.validateAllProduct();

    }
    @And("I click pulsa button")
    public void clickPulsaButton(){
        allProductPage.clickPulsaButton();

    }
    @Then("I on the transaction page")
    public void transactionPage(){
        transactionPage.validateTransactionPage();

    }
}
