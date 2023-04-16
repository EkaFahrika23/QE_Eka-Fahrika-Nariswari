package Starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By homePage(){
        return By.id("button_home");
    }
    @Step
    public void validateHomePage(){
        $(homePage()).isDisplayed();
    }
    private By allProductButton(){
        return By.id("Lainnya");
    }
    @Step
    public void ProductButton(){
        $(allProductButton()).click();
    }

}
