package com.cydeo.step_definitions.Day4;

import com.cydeo.pages.Dropdowns_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class Dropdowns_StepDef {

    Dropdowns_Page dropdownsPage = new Dropdowns_Page();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }


    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        // For other transformations you can register a DataTableType.

       // This utility method will return us List of String of given dropdown WebElement
        List<String> actualOptionsAsString =  BrowserUtils.dropDownOptionsAsString(dropdownsPage.monthDropDown);

        // Assert will check the size of the list first. If it is matching it will check/verify content by 1/1
        Assert.assertEquals(expectedMonths,actualOptionsAsString);
    }

}
