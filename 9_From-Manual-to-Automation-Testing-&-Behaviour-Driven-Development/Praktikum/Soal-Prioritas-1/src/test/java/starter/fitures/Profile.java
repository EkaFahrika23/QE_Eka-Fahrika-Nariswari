package starter.fitures;

import net.thucydides.core.annotations.Step;

public class Profile {

    @Step("user access the LinkedIn Application")
    public void accessTheAccount(){
        System.out.println("user access the LinkedIn Application");
    }
    @Step("user clicks on their profile picture")
    public void clickProfilePicture(){
        System.out.println("user clicks on their profile picture");
    }
    @Step("user will be redirected to their profile page")
    public void redirectedProfilePage(){
        System.out.println("user will be redirected to their profile page");
    }
    @Step("user can view their basic information, work experience, education and other relevant details")
    public void viewProfile(){
        System.out.println("user can view their basic information, work experience, education and other relevant details");
    }
}
