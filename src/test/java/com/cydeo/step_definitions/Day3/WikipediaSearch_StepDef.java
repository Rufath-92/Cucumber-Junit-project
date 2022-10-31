package com.cydeo.step_definitions.Day3;

import com.cydeo.pages.WikipediaSearch_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WikipediaSearch_StepDef {

    WikipediaSearch_Page wikipedia_search_page = new WikipediaSearch_Page();
    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }


    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
        wikipedia_search_page.searchBox.sendKeys("Steve Jobs");
    }


    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        BrowserUtils.sleep(3);
        wikipedia_search_page.searchBtn.click();
    }


    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        BrowserUtils.verifyTitle_assertTrue("Steve Jobs - Wikipedia");
    }




    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String keyword) {
        wikipedia_search_page.searchBox.sendKeys(keyword);
    }

    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String string) {
        BrowserUtils.verifyTitle_assertTrue(string);
    }
}
