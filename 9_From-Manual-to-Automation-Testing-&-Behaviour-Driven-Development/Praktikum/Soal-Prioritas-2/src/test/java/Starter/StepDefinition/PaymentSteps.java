package Starter.StepDefinition;

import Starter.features.Payment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PaymentSteps {

    @Steps
    Payment payment;

    @Given("user navigate to detail of payment")
    public void detailOfPayment(){
        payment.detailOfPayment();
    }
    @When("user choice the method of payment to buy the product")
    public void choiceMethodPayment(){
        payment.choiceMethodPayment();
    }
    @Then("user click \"Buy Now\" button to finish the transaction")
    public void BuyNow(){
        payment.BuyNow();
    }
    @And("user get a receipt")
    public void getReceipt(){
        payment.getReceipt();
    }
}

