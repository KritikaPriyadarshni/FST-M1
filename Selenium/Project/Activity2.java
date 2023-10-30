package FST_CRM_java_Project;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Activity2 {
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
        String url = driver.findElement(By.xpath("//*[@id=\"form\"]/div[1]/img")).getAttribute("src");
        System.out.println("Header Image Url: " + url);
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.close();
    }
}