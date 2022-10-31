package com.cydeo.step_definitions.HW;

import com.cydeo.pages.WebTableOrderHW_Page;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WebTableOrder_StepDef {

    WebTableOrderHW_Page webTableOrderHW_page = new WebTableOrderHW_Page();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigReader.getProperty("envWebTable"));
        webTableOrderHW_page.login_and_going_order_page(ConfigReader.getProperty("Username"),ConfigReader.getProperty("Password"));
    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String product) {
        webTableOrderHW_page.setting_product(product);

    }
    @When("user enters quantity {string}")
    public void user_enters_quantity(String quantity) {
        webTableOrderHW_page.quantity.clear();
        webTableOrderHW_page.quantity.sendKeys(quantity);
    }
    @When("user enters name {string}")
    public void user_enters_name(String customerName) {
        webTableOrderHW_page.customerName.sendKeys(customerName);
    }
    @When("user enters street {string}")
    public void user_enters_street(String street) {
        webTableOrderHW_page.street.sendKeys(street);
    }
    @When("user enters city {string}")
    public void user_enters_city(String city) {
        webTableOrderHW_page.city.sendKeys(city);
    }
    @When("user enters state {string}")
    public void user_enters_state(String state) {
        webTableOrderHW_page.state.sendKeys(state);
    }
    @When("user enters zip code {string}")
    public void user_enters_zip_code(String zip) {
        webTableOrderHW_page.zipcode.sendKeys(zip);
    }
    @When("user selects card {string}")
    public void user_selects_card_visa(String cardType) {
        webTableOrderHW_page.chooseCard(cardType);
    }
    @When("user enters  card number {string}")
    public void user_enters_card_number(String cardNumber) {
        webTableOrderHW_page.cardNumber.sendKeys(cardNumber);
    }
    @When("user enters exp date {string}")
    public void user_enters_exp_date(String date) {
        webTableOrderHW_page.expDate.sendKeys(date);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        webTableOrderHW_page.processBtn.click();

    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String verificationName) {
       Assert.assertEquals(verificationName,webTableOrderHW_page.verifyName.getText());
    }



}
