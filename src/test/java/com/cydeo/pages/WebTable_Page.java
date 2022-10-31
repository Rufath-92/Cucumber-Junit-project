package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTable_Page extends BasePage {

    public WebTable_Page() {

    }

    @FindBy(name = "username")
    public WebElement usernameBox;

    @FindBy(name = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;


    public  void loginHomePage(String username,String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginBtn.click();
    }
}
