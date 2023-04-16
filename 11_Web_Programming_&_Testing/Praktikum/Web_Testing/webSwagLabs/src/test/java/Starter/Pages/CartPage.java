package Starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class CartPage extends PageObject {
    private By titleCart(){
        return By.className("title");
    }
    public void validateCartPage(){
        $(titleCart()).isDisplayed();
    }
    private By removeButton(){
        return By.id("remove-sauce-labs-backpack");
    }
    private By continueShopping(){
        return By.id("continue-shopping");
    }
    @Step
    public void clickRemoveButton(){
        $(removeButton()).click();
    }
    @Step
    public void clickContinueShopping(){
        $(continueShopping()).click();
    }


}
