package Starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class DetailPaymentPage extends PageObject {

    private By onTheDetailPage(){
        return By.id("panel_summary");
    }
    private By choiceGopay(){
        return By.id("checkbox Gopay");
    }
    @Step
    public void validateDetailPayment(){
        $(onTheDetailPage()).isDisplayed();
    }
    @Step
    public void choicePaymentGopay(){
        $(choiceGopay()).click();
    }
}
