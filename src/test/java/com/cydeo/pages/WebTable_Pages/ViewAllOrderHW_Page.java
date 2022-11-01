package com.cydeo.pages.WebTable_Pages;

import com.cydeo.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewAllOrderHW_Page extends BasePage {

    public ViewAllOrderHW_Page() {
    }

    @FindBy(xpath = "//table[@class='table is-fullwidth']/tbody/tr[1]/td[1]")
    public WebElement verifyName;
}
