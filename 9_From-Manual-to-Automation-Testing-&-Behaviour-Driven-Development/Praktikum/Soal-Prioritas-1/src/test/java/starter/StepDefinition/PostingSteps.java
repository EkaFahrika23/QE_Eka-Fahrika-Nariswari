package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitures.Posting;

public class PostingSteps {

    @Steps
    Posting posting;

    @Given("user navigate to the home page")
    public void navigateToTheHomePage(){
        posting.navigateToTheHomePage();
    }
    @When("user click \"create a post\" button")
    public void createPost(){
        posting.createPost();
    }
    @Then("user will be able to create a post, including adding text, images, videos, links or other multimedia content.")
    public void fillsThePost(){
        posting.fillsThePost();
    }
    @And("user the finish the post after that the connection can be see the posting")
    public void finishPost(){
        posting.finishPost();
    }
}
