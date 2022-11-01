package com.cydeo.step_definitions.Day4;

import com.cydeo.pages.WebTable_Pages.WebTable_Page;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTable_StepDef {


   WebTable_Page web_table_page = new WebTable_Page();
    @Given("Users is on the login page of web table app")
    public void users_is_on_the_login_page_of_web_table_app() {
     Driver.getDriver().get(ConfigReader.getProperty("env"));
    }
    @When("Users enters username {string}")
    public void users_enters_username(String string) {
   //  web_table_page.loginHomePage();
     web_table_page.usernameBox.sendKeys(string);
    }
    @When("Users enters password {string}")
    public void users_enters_password(String string) {
     web_table_page.passwordBox.sendKeys(string);
    }
    @When("Users clicks to login button")
    public void users_clicks_to_login_button() {
     web_table_page.loginBtn.click();

    }
    @Then("Users should see url contains orders")
    public void users_should_see_url_contains_orders() {
     //BrowserUtils.verifyTitle_assertTrue("orders");
     Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));

    }


    @When("User enters username {string} password {string} and logins")
 public void userEntersUsernamePasswordAndLogins(String username, String password) {
//     web_table_page.usernameBox.sendKeys(username);
//     web_table_page.passwordBox.sendKeys(password);
//     web_table_page.loginBtn.click();

     web_table_page.loginHomePage(username,password);
 }




 @When("user enters below credentials")
 public void userEntersBelowCredentials(Map<String,String> credentials) {
//     web_table_page.usernameBox.sendKeys(credentials.get("username"));
//     web_table_page.passwordBox.sendKeys(credentials.get("password"));
//     web_table_page.loginBtn.click();

  web_table_page.loginHomePage(credentials.get("username"),credentials.get("password"));


 }
}
