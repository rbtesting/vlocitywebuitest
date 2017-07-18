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
 * Created by sigma on 5/20/2017.
 */

public class vlocityDashboard {

    public WebDriver driver;
    public WebDriverWait wait;
    //This costructor will initialize the object in the page
    public vlocityDashboard(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,20);
    }

    // locate all the elements of the Dashboard page
    @FindBy(how = How.ID , using = "DashboardLink")
    public WebElement link_Dashboard;

    @FindBy(how = How.ID , using = "IOPerformanceLink")
    public WebElement link_IOPerformance;

    @FindBy(how = How.ID , using = "AnalyticsLink")
    public WebElement link_Analytics;

    @FindBy(how = How.ID , using = "BMReportsLink")
    public WebElement link_BenchmarkDataReport;

    @FindBy(how = How.CSS, using = ".benefitValueText7")
    public  WebElement storage_IOTimeSaved;



public  void clickDashboard()
{
     link_Dashboard.click();
    assertTrue(driver.getTitle().contains("V-locity | Dashboard"));
}
public void clickIOPerformance()
{
    link_IOPerformance.click();

    wait.until(ExpectedConditions.titleContains("V-locity | I/O Performance"));
    assertTrue(driver.getTitle().contains("V-locity | I/O Performance"));
}
public void clickAnalytics()
{
    link_Analytics.click();
    wait.until(ExpectedConditions.titleContains("V-locity | Analytics"));
    assertTrue((driver.getTitle().contains("V-locity | Analytics")));
      // return PageFactory.initElements(driver,vlocityAnalytics.class);
}
public void clickBenchMarkDataReport()
{
    link_BenchmarkDataReport.click();
    wait.until(ExpectedConditions.titleContains("Benefit Analysis Report"));
    assertTrue(driver.getTitle().contains("Benefit Analysis Report"));
    //return PageFactory.initElements(driver,vlocityBenchMarkDataReport .class);
}

public void get_DashboardData()
{

     List<WebElement> elements = driver.findElements(By.cssSelector(".benefitValueText"));
        System.out.println("Total IOs Eliminated : " + elements.get(0).getText());
        System.out.println("Read IOs Eliminated :" + elements.get(2).getText());
        System.out.println("Write IOs Eliminated : " + elements.get(4).getText());
        System.out.println("Fragments Prevented and Eliminated :" + elements.get(6).getText());
        System.out.println("Free Spaces Consolidated :" + elements.get(7).getText());
        System.out.println("Storage IO Time Saved :" + storage_IOTimeSaved.getText());

}
public void get_vLocityStatus()
{
    List<WebElement> vlocityStatus = driver.findElements(By.cssSelector(".benefitExceedsText"));
    System.out.println("BDC Status:" + vlocityStatus.get(0).getText());
    System.out.println("IntelliMemory Status" + vlocityStatus.get(1).getText());
}

}
