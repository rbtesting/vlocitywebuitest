package com.vlocity.pageobjects;

import org.apache.xpath.operations.Bool;
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
public class vlocityManageConfiguration {

    public WebDriver driver;
    public WebDriverWait wait;

    @FindBy(how=How.CSS , using = "#enableIntelliMemoryCheckbox")
    WebElement chk_EnableIM;

    @FindBy(how=How.CSS , using = "#enableIntelliWriteCheckbox")
    WebElement chk_EnableIW;

    @FindBy(how=How.CSS , using = "#enableFragmentationCheckbox")
    WebElement chk_EnableFilePerf;

    @FindBy(how=How.CSS , using = "#checkIntelliMemoryCheckbox")
    WebElement chk_EnableSpaceReclamation;

    @FindBy(how = How.CSS , using = ".btn.main.applyPolicy")
    WebElement btn_ApplyConfigButton;

    @FindBy(how = How.CSS , using = "#AdvancedConfigLink")
    WebElement lnk_AdvConfiglink;

    //This costructor will initialize the object in the page
    public vlocityManageConfiguration(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,20);
    }

    public void get_VlocityConfig()
    {
        Boolean isSelectedIM;
        if (chk_EnableIM.isSelected()) {
            isSelectedIM = true;
            System.out.println("IM is Checked");
        }
        else
        {
            System.out.println("IM is Unchecked");
            isSelectedIM = false;
        }
        Boolean isSelectedIW;
        if(chk_EnableIW.isSelected())
        {
            isSelectedIW = true;
            System.out.println("IW is Checked");
        }
        else
        {
            System.out.println("IW is Unchecked");
        }
        Boolean isSelectedFilePer;
        if(chk_EnableFilePerf.isSelected())
        {
            isSelectedFilePer = true;
            System.out.println("FilePer is Checked");
        }
        else
        {
            isSelectedFilePer = false;
            System.out.println("FilePerf is Unchecked");
        }
        Boolean isSelectedSpaceRec;
        if(chk_EnableSpaceReclamation.isSelected())
        {
            isSelectedSpaceRec = true;
            System.out.println("Space Reclamation is Checked");
        }
        else
        {
            System.out.println("Space Reclamation is Unchecked");
        }

    }

    public void apply_Configuration()
    {
        btn_ApplyConfigButton.click();
    }

    public void enable_IM()
    {
        if(!(chk_EnableIM.isSelected()))
        {
            chk_EnableIM.click();
            apply_Configuration();
        }

    }

    public void disable_IM()
    {
        if(chk_EnableIM.isSelected())
        {
            chk_EnableIM.click();
            apply_Configuration();
        }
    }

    public void enable_IW()
    {
        if(!(chk_EnableIW.isSelected()))
        {
            chk_EnableIW.click();
            apply_Configuration();
        }
    }
    public void disable_IW()
    {
        if(chk_EnableIW.isSelected())
        {
            chk_EnableIW.click();
            apply_Configuration();
        }
    }
    public void enable_FilePer()
    {
        if(!(chk_EnableFilePerf.isSelected()))
        {
            chk_EnableFilePerf.click();
            apply_Configuration();
        }
    }
    public void disable_FilePer()
    {
        if(chk_EnableFilePerf.isSelected())
        {
            chk_EnableFilePerf.click();
            apply_Configuration();
        }
    }
    public void enable_SpaceReclamation()
    {
        if(!(chk_EnableSpaceReclamation.isSelected()))
        {
            chk_EnableSpaceReclamation.click();
            apply_Configuration();
        }

    }
    public void disable_SpaceReclamation()
    {
        if(chk_EnableSpaceReclamation.isSelected())
        {
            chk_EnableSpaceReclamation.click();
            apply_Configuration();
        }
    }

}
