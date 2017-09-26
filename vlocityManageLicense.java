package com.vlocity.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.vlocity.Common.Util;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
//import static util.vlocity.Common.Util.waitForElement;
/**
 * Created by sigma on 7/15/2017.
 */
public class vlocityManageLicense {

    public WebDriver driver;
    public WebDriverWait wait;
    //This costructor will initialize the object in the page
    public vlocityManageLicense(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,20);
    }


  public void get_LicenseInfo()
  {
      List<WebElement> txt_LicenseInfo = driver.findElements(By.cssSelector(".licenseDescription>table>tbody>tr>td"));
      System.out.println("Edition is :" + txt_LicenseInfo.get(1).getText());
      System.out.println("Type is :" + txt_LicenseInfo.get(3).getText());
      System.out.println("State is :" + txt_LicenseInfo.get(5).getText());
      System.out.println("Licensed By :" + txt_LicenseInfo.get(7).getText());

  }



}
