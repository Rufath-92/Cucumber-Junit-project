package com.cydeo.step_definitions.Day1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest_StepDef {

    @Given("user on the library login page")
    public void user_on_the_library_login_page() {
        System.out.println("user on the library login page");
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("user enters librarian username");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");
       //TODO: I need to do implementation for librarian password
    }
    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("user should see dashboard");
    }




    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("user enters student username");

    }
    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("user enters student password");
    }


    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("user enters admin username");
    }
    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("user enters admin password");
    }

    @Given("user is on the library login page")
    public void userIsOnTheLibraryLoginPage() {
        System.out.println("User is on  the login page");
    }
}
