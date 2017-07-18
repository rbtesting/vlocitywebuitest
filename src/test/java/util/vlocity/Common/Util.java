package util.vlocity.Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

/**
 * Created by sigma on 5/20/2017.
 */
public class Util {
    final static int WAIT_TIME_OUT=2000;

    /* public static void waitForElement(WebDriver driver,By by)
    {
        WebDriverWait wait = new WebDriverWait(driver,WAIT_TIME_OUT);
        wait.until(visibilityOfAllElementsLocatedBy(by));
        //wait.until(visibilityOf(element));

    }*/

    /*public static void click(WebDriver driver,By by)
    {
        WebElement element = driver.findElement(by);
        element.click();
    }*/


}
