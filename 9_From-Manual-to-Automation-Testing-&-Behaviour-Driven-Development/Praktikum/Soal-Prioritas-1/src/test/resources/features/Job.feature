Feature: Job
  As I a user
  I want to search the jobs from LinkedIn
  So that I can find the jobs

  Scenario: Search for job
    Given user on the job page
    When user types a job title or keyword in the search bar
    Then user will see search results displaying job openings that match the search criteria, including the job title, company name, location and job description

    Scenario: Save a job
      Given user access job page
      When user finds a job opening they are interested in
      Then user will see a "Save" button, after clicking it, user can save the job opening to their saved jobs list

      Scenario: Apply for job
        Given user access the job page
        When user finds a job opening they want to apply for
        Then user will be able to apply for the job opening by clicking the "Apply" button and following the application process