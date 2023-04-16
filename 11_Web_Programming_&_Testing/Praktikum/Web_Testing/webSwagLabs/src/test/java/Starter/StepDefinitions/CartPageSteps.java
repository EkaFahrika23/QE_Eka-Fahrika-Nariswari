package Starter.StepDefinitions;

import Starter.Pages.CartPage;
import Starter.Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CartPageSteps {
    @Steps
    HomePage homePage;

    @Steps
    CartPage cartPage;

    @Given("I on the cart page")
    public void onTheCartPage(){
        cartPage.validateCartPage();

    }
    @When("I am remove the product on the cart page")
    public void removeProduct(){
        cartPage.clickRemoveButton();

    }
    @And("I click continue to shopping")
    public void continueShopping(){
        cartPage.clickContinueShopping();

    }
    @Then("I in the home page")
    public void onTheHomePage(){
        homePage.validateHomePage();

    }
}
