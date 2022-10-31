package com.cydeo.step_definitions.HW;


import com.cydeo.pages.SmartBear_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class SmartBear_StepDef {

    SmartBear_Page smartBear_page = new SmartBear_Page();
    @Given("User logs in")
    public void user_logs_in() {
        Driver.getDriver().get(ConfigReader.getProperty("envSmartBear"));
        smartBear_page.loginToSmartBear(ConfigReader.getProperty("UserName"),ConfigReader.getProperty("UserPassword"));
    }
    @Given("User goes to the Order page")
    public void user_goes_to_the_order_page() {
        smartBear_page.orderModule.click();

    }
    @Then("User is on Order page")
    public void user_is_on_order_page() {
        BrowserUtils.verifyTitle_assertTrue("Web Orders");
    }



    @When("User selects the FamilyAlbum from product dropdown")
    public void user_selects_the_family_album_from_product_dropdown() {
        Select select = new Select(smartBear_page.productBox);
        select.selectByValue("FamilyAlbum");

    }
    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String quantity) {
        smartBear_page.quantityBox.sendKeys(quantity);

    }
    @When("User enters {string} to costumer's name")
    public void user_enters_to_costumer_s_name(String name) {
        smartBear_page.costumerNameBox.sendKeys(name);

    }
    @When("User enters {string} to the street")
    public void user_enters_to_the_street(String street) {
        smartBear_page.streetBox.sendKeys(street);
    }
    @When("User enters {string} to the city")
    public void user_enters_to_the_city(String city) {
        smartBear_page.cityBox.sendKeys(city);
    }
    @When("User enters {string} to the state")
    public void user_enters_to_the_state(String state) {
        smartBear_page.stateBox.sendKeys(state);
    }
    @When("User enters {string} to zipcode")
    public void user_enters_to_zipcode(String zipCode) {
        smartBear_page.zipCodeBox.sendKeys(zipCode);
    }
    @When("User selects Visa as a card type")
    public void user_selects_visa_as_a_card_type() {
        smartBear_page.visaCardSelect.click();
    }
    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String cardNumber) {
        smartBear_page.cardNumberBox.sendKeys(cardNumber);
    }
    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String date) {
        smartBear_page.expireDateBox.sendKeys(date);
    }
    @When("User clicks the process button")
    public void user_clicks_the_process_button() {
        smartBear_page.processBtn.click();
        BrowserUtils.sleep(3);
    }
    @When("User goes to the Web Orders Page")
    public void user_goes_to_the_web_orders_page() {
        smartBear_page.viewAllOrderBtn.click();

    }
    @Then("User verifies {string} is on the list")
    public void user_verifies_is_on_the_list(String string) {
        Assert.assertTrue(smartBear_page.JohnWickName.isDisplayed());

    }
}
