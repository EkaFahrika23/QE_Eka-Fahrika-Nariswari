package Starter.StepDefinitions;

import Starter.Pages.DetailPaymentPage;
import Starter.Pages.TransactionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PaymentSteps {
    @Steps
    TransactionPage transactionPage;

    @Steps
    DetailPaymentPage detailPaymentPage;

    @Given("I am on the transaction pulsa page")
    public void onTheTransactionPulsa(){
        transactionPage.validateTransactionPage();

    }
    @When("I am input valid number phone")
    public void inputValidPhone(){
        transactionPage.inputPhone("083845625181");

    }
    @And("I click 5.000 button")
    public void click5000Button(){
        transactionPage.clickAxisButton();

    }
    @And("I am on the detail payment page")
    public void detailPayment(){
        detailPaymentPage.validateDetailPayment();

    }
    @Then("I choice payment method of gopay")
    public void clickGopayButton(){
        detailPaymentPage.choicePaymentGopay();

    }
}
