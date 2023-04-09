package Starter.StepDefinition;

import Starter.features.Product;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ProductSteps {

    @Steps
    Product product;

    @Given("user login to Sepulsa application")
    public void LoginSepulsa(){
        product.loginSepulsa();

    }
    @When("user navigate to the product page")
    public void onTheProductPage(){
        product.onTheProductPage();
    }
    @Then("user choice the one or some product")
    public void choiceTheProduct(){
        product.choiceTheProduct();
    }
    @And("user can be transaction to buy the product")
    public void transactionTheProduct(){
        product.transactionTheProduct();
    }
}
