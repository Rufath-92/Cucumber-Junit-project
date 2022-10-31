package com.cydeo.step_definitions.Day2;

import com.cydeo.pages.GoogleSearch_Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearch_StepDef {

    GoogleSearch_Page googleSearchPage = new GoogleSearch_Page();
    @Given("User is on Google search page")
    public void search_page(){
        Driver.getDriver().get("https://www.google.com/");
    }


    @When("User types apple in the google search box and clicks enter")
    public void type_searchBox_and_click(){
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }


    @Then("User sees apple – Google Search is in the google title")
    public void check_title(){

    String actual = Driver.getDriver().getTitle();
    String expected = "apple - Google Search";
        Assert.assertEquals("Title failed",expected,actual);

    }




    @When("User types {string} in the google search box and clicks enter")
    public void user_types_in_the_google_search_box_and_clicks_enter(String searchKeyword) {
        googleSearchPage.searchBox.sendKeys(searchKeyword + Keys.ENTER);

    }
    @Then("User sees {string} is in the google title")
    public void user_sees_is_in_the_google_title(String expectedTitle) {

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

    }
}
