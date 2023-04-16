package Starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By title(){
        return By.className("title");

    }
    public void validateHomePage(){
        $(title()).isDisplayed();
    }
    private By AddToCartButton(){
        return By.id("add-to-cart-sauce-labs-backpack");
    }
    private By CartFeature(){
        return By.id("shopping_cart_container");
    }
    @Step
    public void ClickAddToCartButton(){
        $(AddToCartButton()).click();
    }
    @Step
    public void clickCartFeature(){
        $(CartFeature()).click();
    }

}
