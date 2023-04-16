package Starter.StepDefinitions;

import Starter.Pages.CartPage;
import Starter.Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HomePageSteps {
    @Steps
    HomePage homePage;

    @Steps
    CartPage cartPage;

    @Given("I on the home page")
    public void onTheHomePage(){
        homePage.validateHomePage();

    }
    @When("I click add to cart button")
    public void addToCart(){
        homePage.ClickAddToCartButton();

    }
    @And("I click cart feature")
    public void clickCartFeature(){
        homePage.clickCartFeature();

    }
    @Then("I am on the cart page")
    public void onTheCartPage(){
        cartPage.validateCartPage();

    }
}
