package com.cydeo.step_definitions.HW;

import com.cydeo.pages.EtsySearch_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EtsySearch_StepDef {

    EtsySearch_Page etsySearchPage = new EtsySearch_Page();

    @Given("User is on Etsy home page")
    public void user_is_on_etsy_home_page() {
        Driver.getDriver().get("https://www.etsy.com");

    }
    @Then("User sees title is as expected")
    public void user_sees_title_is_as_expected() {
        BrowserUtils.verifyTitle_assertTrue("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone");

    }


    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
    etsySearchPage.searchBox.sendKeys("Wooden Spoon");

    }

    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        BrowserUtils.verifyTitle_assertTrue("Wooden spoon - Etsy");
    }



    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String typingWord) {
    etsySearchPage.searchBox.sendKeys(typingWord);
    }
    @When("User clicks search button")
    public void user_clicks_search_button() {
        etsySearchPage.search_Btn.click();

    }
    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String expectedTitle) {
      BrowserUtils.verifyTitle_assertTrue(expectedTitle);
    }

}
