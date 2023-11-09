package activities;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
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

public class Activity4 {
    // Driver Declaration
    AndroidDriver driver;
    WebDriverWait wait;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.samsung.android.app.contacts");
        options.setAppActivity("com.samsung.android.contacts.contactslist.PeopleActivity");
        options.noReset();

        // Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Test method
    @Test
    public void contactsTest() {
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        // Find and click the add button
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc='Create contact']")).click();

        // Wait for elements to load
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.accessibilityId("Show detailed name fields")
        )).click();
        //wait.until(ExpectedConditions.elementToBeClickable(
          //      AppiumBy.xpath("//android.widget.EditText[@text='First name']")
        //));

        // Enter the details
        driver.findElement(AppiumBy.xpath(
                "//android.widget.EditText[@text='First name']"
        )).sendKeys("Aaditya");
        driver.findElement(AppiumBy.xpath(
                "//android.widget.EditText[@text='Last name']"
        )).sendKeys("Varma");

        driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".scrollForward()"));

        WebElement phone = driver.findElement(AppiumBy.xpath(
                "//android.widget.TextView[@text='Phone']"
        ));
        phone.click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath(
                "//android.widget.EditText[@text='Phone']")));
        WebElement enterNumber = driver.findElement(AppiumBy.xpath(
                "//android.widget.EditText[@text='Phone']"
        ));
        enterNumber.sendKeys("999148292");

        // Click Save
        driver.findElement(AppiumBy.xpath(
                "//android.widget.TextView[@text='Save']")).click();

        // Wait for contact to save
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.samsung.android.app.contacts:id/header")));

        // Assertion
        String contactName = driver.findElement(AppiumBy.id("com.samsung.android.app.contacts:id/header")).getText();
        Assert.assertEquals(contactName, "Aaditya Varma");
    }

    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}
