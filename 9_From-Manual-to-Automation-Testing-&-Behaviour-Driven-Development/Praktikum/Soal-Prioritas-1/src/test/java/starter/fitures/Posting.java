package starter.fitures;

import net.thucydides.core.annotations.Step;

public class Posting {

    @Step("user navigate to the home page")
    public void navigateToTheHomePage(){
        System.out.println("user navigate to the home page");
    }
    @Step("user click \"create a post\" button")
    public void createPost(){
        System.out.println("user click \"create a post\" button");
    }
    @Step("user will be able to create a post, including adding text, images, videos, links or other multimedia content.")
    public void fillsThePost(){
        System.out.println("user will be able to create a post, including adding text, images, videos, links or other multimedia content.");
    }
    @Step("user the finish the post after that the connection can be see the posting")
    public void finishPost(){
        System.out.println("user the finish the post after that the connection can be see the posting");
    }
}
