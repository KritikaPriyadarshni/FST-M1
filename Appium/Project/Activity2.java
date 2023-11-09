package Appium_Project;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class activityGKeep {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.keep");
        options.setAppActivity("com.google.android.apps.keep.ui.activities.BrowseActivity");
        options.noReset();

        // Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Test
    public void googleKeep() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //driver.findElement(AppiumBy.id("android:id/button1"));
        driver.findElement(AppiumBy.accessibilityId("New text note")).click();
        //driver.findElement(AppiumBy.accessibilityId("com.android.permissioncontroller:id/permission_allow_button")).click();

        //Add Title
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.google.android.keep:id/editable_title")));
        driver.findElement(AppiumBy.id("com.google.android.keep:id/editable_title")).sendKeys("Appium Project");

        //Add Note
        driver.findElement(AppiumBy.id("com.google.android.keep:id/edit_note_text")).sendKeys("Complete google keep activity");
        driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();

        //Assertion
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text='Appium Project']")));
        String title = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Appium Project']")).getText();
        Assert.assertEquals(title, "Appium Project");




    }
    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }

}