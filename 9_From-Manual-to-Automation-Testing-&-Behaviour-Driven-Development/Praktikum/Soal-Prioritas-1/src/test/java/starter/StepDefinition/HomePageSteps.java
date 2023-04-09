package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitures.HomePage;

public class HomePageSteps {

    @Steps
    HomePage HomePage;
    @Given("user is logged in to their LinkedIn")
    public void loggedLinkedin(){
        HomePage.loggedLinkedin();
    }
    @When("user opens the home page LinkedIn")
    public void openHomePage(){
        HomePage.openHomePage();
    }
    @Then("user will see a feed containing posts from their connections and followed pages")
    public void seePostFromConnections(){
        HomePage.seePostFromConnections();
    }
    @Given("user is logged in to their account")
    public void LoggedAccount(){
        HomePage.LoggedAccount();
    }
    @When("user opens the home page")
    public void openTheHomePage(){
        HomePage.openTheHomePage();
    }
    @Then("user will see the latest posts from their connections and followed pages")
    public void seeLatestPost(){
        HomePage.seeLatestPost();
    }
    @Given("user login in to their LinkedIn account")
    public void LoggedToAccount(){
        HomePage.LoggedToAccount();
    }
    @When("user types a name of a connection they want to search for in the search bar")
    public void wantToSearch(){
        HomePage.wantToSearch();
    }
    @Then("user will see search results displaying profiles that match the search criteria")
    public void searchCriteria(){
        HomePage.searchCriteria();
    }
    @Given("user login in to their LinkedIn")
    public void loggedToAccount(){
        HomePage.loggedToAccount();
    }
    @When("user opens the post they want to share")
    public void wantToShare(){
        HomePage.wantToShare();
    }
    @Then("user will see a \"Share\" button, after clicking it, user can share the post to their connections or a specific page.")
    public void SharePosts(){
        HomePage.SharePosts();
    }
    @And("The post will appear on their home page and the connection or page will receive a notification about the shared post.")
    public void ShareConnection(){
        HomePage.ShareConnection();
    }

}
