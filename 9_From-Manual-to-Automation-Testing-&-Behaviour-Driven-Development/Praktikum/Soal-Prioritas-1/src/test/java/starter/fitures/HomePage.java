package starter.fitures;

import net.thucydides.core.annotations.Step;

public class HomePage {
    @Step("user is logged in to their LinkedIn")
    public void loggedLinkedin(){
        System.out.println("user is logged in to their LinkedIn");
    }
    @Step("user opens the home page LinkedIn")
    public void openHomePage(){
        System.out.println("user opens the home page LinkedIn");
    }
    @Step("user will see a feed containing posts from their connections and followed pages")
    public void seePostFromConnections(){
        System.out.println("user will see a feed containing posts from their connections and followed pages");
    }
    @Step("user is logged in to their account")
    public void LoggedAccount(){
        System.out.println("user is logged in to their account");
    }
    @Step("user opens the home page")
    public void openTheHomePage(){
        System.out.println("user opens the home page");
    }
    @Step("user will see the latest posts from their connections and followed pages")
    public void seeLatestPost(){
        System.out.println("user will see the latest posts from their connections and followed pages");
    }
    @Step("user login in to their LinkedIn account")
    public void LoggedToAccount(){
        System.out.println("user login in to their LinkedIn account");
    }
    @Step("user types a name of a connection they want to search for in the search bar")
    public void wantToSearch(){
        System.out.println("user types a name of a connection they want to search for in the search bar");
    }
    @Step("user will see search results displaying profiles that match the search criteria")
    public void searchCriteria(){
        System.out.println("user will see search results displaying profiles that match the search criteria");
    }
    @Step("user login in to their LinkedIn")
    public void loggedToAccount(){
        System.out.println("user login in to their LinkedIn");
    }
    @Step("user opens the post they want to share")
    public void wantToShare(){
        System.out.println("user opens the post they want to share");
    }
    @Step("user will see a \"Share\" button, after clicking it, user can share the post to their connections or a specific page.")
    public void SharePosts(){
        System.out.println("user will see a \"Share\" button, after clicking it, user can share the post to their connections or a specific page.");
    }
    @Step("The post will appear on their home page and the connection or page will receive a notification about the shared post.")
    public void ShareConnection() {
        System.out.println("The post will appear on their home page and the connection or page will receive a notification about the shared post.");
    }
}
