package Starter.features;

import net.thucydides.core.annotations.Step;

public class Login {
    @Step("user on the login page")
    public void onTheLoginPage(){
        System.out.println("user on the login page");
    }
    @Step("user enter valid number phone or email and password")
    public void enterValidation(){
        System.out.println("user enter valid number phone or email and password");
    }
    @Step("user click login button")
    public void clickLoginButton(){
        System.out.println("user click login button");
    }
    @Step("user can see home page to be transactions there")
    public void successLogin(){
        System.out.println("user can see home page to be transactions there");
    }
    @Step("user navigate to login page")
    public void accessLoginPage(){
        System.out.println("user navigate to login page");
    }
    @Step("user enter the invalid email")
    public void enterInvalidEmail(){
        System.out.println("user enter the invalid email");
    }
    @Step("an error message is displayed indicating that the email address is invalid")
    public void errorInvalidEmail(){
        System.out.println("an error message is displayed indicating that the email address is invalid");
    }
    @Step("a user navigate to login page")
    public void onTheLogin(){
        System.out.println("a user navigate to login page");
    }
    @Step("user enter the invalid number phone")
    public void enterInvalidPhone(){
        System.out.println("user enter the invalid number phone");
    }
    @Step("an error message is displayed indicating that the number phone is invalid")
    public void errorInvalidPhone(){
        System.out.println("an error message is displayed indicating that the number phone is invalid");
    }
    @Step("a user navigates to the login page")
    public void navigateToLogin(){
        System.out.println("a user navigates to the login page");
    }
    @Step("the user enters a valid email address or number phone and an incorrect password")
    public void enterIncorrectPassword(){
        System.out.println("the user enters a valid email address or number phone and an incorrect password");
    }
    @Step("an error message is displayed indicating that the password")
    public void errorIncorrectPassword() {
        System.out.println("an error message is displayed indicating that the password");
    }
}
