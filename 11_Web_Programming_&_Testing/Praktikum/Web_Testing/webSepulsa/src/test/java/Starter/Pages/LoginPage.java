package Starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By usernameField(){
        return By.id("email");
    }
    private By passwordField(){
        return By.id("password");
    }
    private By LoginButton(){
        return By.id("submit_login");
    }

    @Step
    public void openPage(){
        open();
    }
    @Step
    public boolean validateOnLoginPage(){
        return $(LoginButton()).isDisplayed();
    }
    @Step
    public void inputEmail(String username){
        $(usernameField()).type(username);
    }
    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }
    @Step
    public void clickLoginButton(){
        $(LoginButton()).click();
    }


}
