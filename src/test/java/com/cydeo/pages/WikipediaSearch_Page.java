package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WikipediaSearch_Page extends BasePage {

   @FindBy(id = "searchInput")
  public WebElement searchBox;

   @FindBy(xpath = "//button[@type='submit']")
   public WebElement searchBtn;


}
