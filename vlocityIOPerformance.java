package com.vlocity.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by sigma on 5/20/2017.
 */
public class vlocityIOPerformance {

    public WebDriver driver;
    public WebDriverWait wait;
    //This costructor will initialize the object in the page
    public vlocityIOPerformance(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,20);
    }

    public void get_MemoryUsage()
    {
        List<WebElement> elements = driver.findElements(By.cssSelector(".benefitValueText"));
        System.out.println("Total Memory (DRAM) is:" + elements.get(9).getText() );
        System.out.println("Data Satisfied from Cache is: " + elements.get(10).getText());
        System.out.println("Avg Free Memory in Cache is: " + elements.get(11).getText());
        System.out.println("Min Free Memory in Cache is: " + elements.get(12).getText());
        System.out.println("Max Free Memory in Cache is: " + elements.get(13).getText());
        System.out.println("Total Avg Free Memory is: "+ elements.get(14).getText());
        System.out.println("Total Min Free Memory is: " + elements.get(15).getText());
        System.out.print("Total Max Free Memory is: " + elements.get(16).getText());
    }

}
