package com.cydeo.pages.WebTable_Pages;

import com.cydeo.pages.BasePage;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebTableOrderHW_Page extends BasePage {

    public WebTableOrderHW_Page() {
    }

    @FindBy(name = "username")
    public WebElement usernameBox;

    @FindBy(name = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginBtn;

    @FindBy(xpath = "//button[.='Order']")
    public WebElement orderBtn;

    public void login_and_going_order_page(String username,String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginBtn.click();
        orderBtn.click();
    }

    @FindBy(xpath = "//select[@name='product']")
    public WebElement selectProduct;

    public void setting_product(String product){
        Select select = new Select(selectProduct);
        select.selectByVisibleText(product);
    }


    @FindBy(name = "quantity")
    public WebElement quantity;

    @FindBy(name = "name")
    public WebElement customerName;

    @FindBy(name = "street")
    public WebElement street;

    @FindBy(name = "city")
    public WebElement city;

    @FindBy(name = "state")
    public WebElement state;

    @FindBy(name = "zip")
    public WebElement zipcode;

    @FindBy(xpath = "//input[@type='radio']")
    public List<WebElement> cardType;

//    public void chooseCard(String card){
//        for (WebElement each : cardType){
//            if(each.getAttribute("value").equalsIgnoreCase(card)){
//                each.click();
//            }
//        }
//    }

    @FindBy(name = "cardNo")
    public WebElement cardNumber;

    @FindBy(name = "cardExp")
    public WebElement expDate;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processBtn;

//    @FindBy(xpath = "//table[@class='table is-fullwidth']/tbody/tr[1]/td[1]")
//    public WebElement verifyName;

//    @FindBy(xpath = "//tbody/tr/td")
//    public WebElement verifyName;



}
