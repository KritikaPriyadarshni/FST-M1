package FST_CRM_java_Project;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
public class Activity1 {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod() {
        // Set up the Firefox driver
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
    @Test
    public void exampleTestCase() {
        // Check the title of the page
        String title = driver.getTitle();
        //Print the title of the page
        System.out.println("Page title is: " + title);
        //Assertion for page title
        Assert.assertEquals("SuiteCRM", title);
        //Find the clickable link on the page and click it
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.close();
    }
}
