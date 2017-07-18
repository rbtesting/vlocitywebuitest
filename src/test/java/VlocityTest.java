import com.vlocity.pageobjects.vlocityDashboard;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.vlocity.Common.Util;

import static org.junit.Assert.*;



/**
 * Created by sigma on 5/19/2017.
 */
public class VlocityTest {
    public static WebDriver driver;

    @Test
    public void Vlocity()
    {
        System.setProperty("webdriver.gecko.driver","C:\\Gecko\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://localhost:13569/");
        vlocityDashboard obj_vlocityDashboard = new vlocityDashboard(driver);
        obj_vlocityDashboard.get_DashboardData();
        //obj_vlocityDashboard.clickDashboard();
        //obj_vlocityDashboard.clickIOPerformance();
        //obj_vlocityDashboard.clickAnalytics();
        //obj_vlocityDashboard.clickBenchMarkDataReport();
        driver.quit();

    }








}
