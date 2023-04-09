package starter.fitures;

import net.thucydides.core.annotations.Step;

public class Job {

    @Step("user on the job page")
    public void onTheJobPage(){
        System.out.println("user on the job page");
    }
    @Step("user types a job title or keyword in the search bar")
    public void typesJobTitle(){
        System.out.println("user types a job title or keyword in the search bar");
    }
    @Step("user will see search results displaying job openings that match the search criteria, including the job title, company name, location and job description")
    public void SearchJobs(){
        System.out.println("user will see search results displaying job openings that match the search criteria, including the job title, company name, location and job description");
    }
    @Step("user access job page")
    public void accessJobPage(){
        System.out.println("user access job page");
    }
    @Step("user finds a job opening they are interested in")
    public void FindJob(){
        System.out.println("user finds a job opening they are interested in");
    }
    @Step("user will see a \"Save\" button, after clicking it, user can save the job opening to their saved jobs list")
    public void SaveJob(){
        System.out.println("user will see a \"Save\" button, after clicking it, user can save the job opening to their saved jobs list");
    }
    @Step("user access the job page")
    public void accessTheJobPage() {
        System.out.println("user access the job page");
    }
    @Step("user finds a job opening they want to apply for")
    public void OpeningJob() {
        System.out.println("user finds a job opening they want to apply for");
    }
    @Step("user will be able to apply for the job opening by clicking the \"Apply\" button and following the application process")
    public void ApplyJob() {
        System.out.println("user will be able to apply for the job opening by clicking the \"Apply\" button and following the application process");
    }
}
