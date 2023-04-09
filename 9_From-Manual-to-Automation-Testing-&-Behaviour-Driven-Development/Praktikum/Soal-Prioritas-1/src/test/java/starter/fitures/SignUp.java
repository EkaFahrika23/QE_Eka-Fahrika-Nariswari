package starter.fitures;

import net.thucydides.core.annotations.Step;

public class SignUp {

    @Step("the user on the sign up page")
    public void onTheSignUpPage(){
        System.out.println("the user on the sign up page");
    }
    @Step("the user fills the valid details")
    public void fillsTheValidDetails(){
        System.out.println("the user fills the valid details");
    }
    @Step("the user should be redirected to their LinkedIn home page")
    public void shouldBeRedirected(){
        System.out.println("the user should be redirected to their LinkedIn home page");
    }
    @Step("a confirmation email should be sent to the user's email address")
    public void confirmationEmail(){
        System.out.println("a confirmation email should be sent to the user's email address");
    }
}
