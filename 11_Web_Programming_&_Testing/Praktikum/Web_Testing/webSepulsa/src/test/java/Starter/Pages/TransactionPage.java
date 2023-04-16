package Starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class TransactionPage extends PageObject {
    private By transactionPage(){
        return By.id("phone_number");
    }
    @Step
    public void validateTransactionPage(){
        $(transactionPage()).isDisplayed();
    }
    private By FieldPhone(){
        return By.id("phone_number");
    }
    private By AxisButton(){
        return By.id("Axis Rp5.000");
    }
    @Step
    public void inputPhone(String phone){
        $(FieldPhone()).type(phone);
    }
    @Step
    public void clickAxisButton(){
        $(AxisButton()).click();
    }
}
