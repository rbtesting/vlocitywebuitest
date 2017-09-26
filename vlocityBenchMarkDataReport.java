package com.vlocity.pageobjects;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import java.util.concurrent.TimeUnit;

/**
 * Created by sigma on 5/20/2017.
 */
public class vlocityBenchMarkDataReport {

public WebDriver driver;
public WebDriverWait wait;

public vlocityBenchMarkDataReport(WebDriver driver)
{
    PageFactory.initElements(driver,this);
    this.driver = driver;
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    wait = new WebDriverWait(driver, 20);
}

    @FindBy(how=How.CSS, using = "#startBenefitAnalysisLink")
    WebElement lnk_InitiateBDC;

    @FindBy(how=How.CSS,using = "#collectBenefitAnalysisLink")
    WebElement lnk_CreateBDC;

    @FindBy(how=How.CSS,using = "#stopBenefitAnalysisLink")
    WebElement lnk_CancelBDC;

    @FindBy(how=How.CSS,using = "input.btn:nth-child(2)")
    WebElement btnAttentionWindow_OK;

    @FindBy(how=How.CSS,using = "div.block:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(3)")
    WebElement btnBDCSettings_Next;

    @FindBy(how=How.CSS,using = "div.block:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(3)")
    WebElement btnBDC_Finish;

    @FindBy(how=How.ID,using = "proceedConfirmJob")
    WebElement btnBDCConfirm_OK;

    @FindBy(how=How.CLASS_NAME, using = "confirmMsg")
    WebElement txt_AttentionMsg;

    @FindBy(how=How.CLASS_NAME,using = "btn main closeModal")
    WebElement btn_BDCInProgress_OK ;

    @FindBy(how=How.CSS,using = ".btn")
    WebElement btn_BDCNotAvailableOK;


    public void start_BDC()
    {
        wait.until(ExpectedConditions.visibilityOf(lnk_InitiateBDC));
        lnk_InitiateBDC.click();
        wait.until(ExpectedConditions.visibilityOf(btnAttentionWindow_OK));
        btnAttentionWindow_OK.click();
        wait.until(ExpectedConditions.visibilityOf(btnBDCSettings_Next));
        btnBDCSettings_Next.click();
        wait.until(ExpectedConditions.visibilityOf(btnBDC_Finish));
        btnBDC_Finish.click();
        wait.until(ExpectedConditions.visibilityOf(btnBDCConfirm_OK));
        btnBDCConfirm_OK.click();

    }

   public void stop_BDC()
   {
       wait.until(ExpectedConditions.visibilityOf(lnk_CancelBDC));
       lnk_CancelBDC.click();
       wait.until(ExpectedConditions.visibilityOf(btnBDCConfirm_OK));
       btnBDCConfirm_OK.click();
   }

   public void Create_BDC()
   {
       wait.until(ExpectedConditions.visibilityOf(lnk_CreateBDC));
       lnk_CreateBDC.click();

       wait.until(ExpectedConditions.visibilityOf(btn_BDCNotAvailableOK));
       if (btn_BDCNotAvailableOK.isDisplayed()) {
           btn_BDCNotAvailableOK.click();
           System.out.println("BDC Report is not available");
       }



   }


}
