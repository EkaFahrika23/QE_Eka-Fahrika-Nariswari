package starter.fitures;

import net.thucydides.core.annotations.Step;

public class Login {
    @Step("I am on the sign in page")
    public void onTheSignInPage(){
        System.out.println("I am on the sign in page");
    }
    @Step("I enter my email or phone number and password correctly")
    public void enterValidCredentials(){
        System.out.println("I enter my email or phone number and password correctly");
    }
    @Step("I click sign in button")
    public void clickSignInButton(){
        System.out.println("I click sign in button");
    }
    @Step("I am on the LinkedIn home page")
    public void onTheHomePage(){
        System.out.println("I am on the LinkedIn home page");
    }
}
