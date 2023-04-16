package Starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class AllProductPage extends PageObject {

    private By allProduct(){
        return By.id("active-menu");
    }
    private By Pulsa(){
        return By.id("Pulsa");
    }
    @Step
    public void validateAllProduct(){
        $(allProduct()).isDisplayed();
    }
    @Step
    public void clickPulsaButton(){
        $(Pulsa()).click();
    }

}
