package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartBear_Page extends BasePage {

    public SmartBear_Page() {
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//a[.='Order']")
    public WebElement orderModule;

    @FindBy(xpath = "//select[@onchange='productsChanged()']")
    public WebElement productBox;

    @FindBy(name = "ctl00$MainContent$fmwOrder$txtQuantity")
    public WebElement quantityBox;

    @FindBy(name = "ctl00$MainContent$fmwOrder$txtName")
    public WebElement costumerNameBox;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox2")
    public WebElement streetBox;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox3")
    public WebElement cityBox;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox4")
    public WebElement stateBox;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox5")
    public WebElement zipCodeBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement visaCardSelect;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox6")
    public WebElement cardNumberBox;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox1")
    public WebElement expireDateBox;

    @FindBy(xpath = "//a[.='Process']")
    public WebElement processBtn;

    @FindBy(xpath = "//a[.='View all orders']")
    public WebElement viewAllOrderBtn;

    @FindBy(xpath = "//table[@class='SampleTable']//td[.='John Wick']")
    public WebElement JohnWickName;




    public void loginToSmartBear(String username,String password){
        userNameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginBtn.click();
    }












}
