package starter.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitures.Job;

public class JobSteps {
    @Steps
    Job Job;

    @Given("user on the job page")
    public void onTheJobPage(){
        Job.onTheJobPage();

    }
    @When("user types a job title or keyword in the search bar")
    public void typesJobTitle(){
        Job.typesJobTitle();

    }
    @Then("user will see search results displaying job openings that match the search criteria, including the job title, company name, location and job description")
    public void SearchJobs(){
        Job.SearchJobs();

    }
    @Given("user access job page")
    public void accessJobPage(){
        Job.accessJobPage();

    }
    @When("user finds a job opening they are interested in")
    public void FindJob(){
        Job.FindJob();

    }
    @Then("user will see a \"Save\" button, after clicking it, user can save the job opening to their saved jobs list")
    public void SaveJob(){
        Job.SaveJob();

    }
    @Given("user access the job page")
    public void accessTheJobPage(){
        Job.accessTheJobPage();

    }
    @When("user finds a job opening they want to apply for")
    public void OpeningJob(){
        Job.OpeningJob();

    }
    @Then("user will be able to apply for the job opening by clicking the \"Apply\" button and following the application process")
    public void ApplyJob(){
        Job.ApplyJob();

    }
}
