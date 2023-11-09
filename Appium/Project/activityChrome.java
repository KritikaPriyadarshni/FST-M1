package Appium_Project;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class activityChrome {
    // Desired Capabilities
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("org.chromium.chrome.browser.ChromeTabbedActivity");
        options.noReset();

        // Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        // Open the browser with the URL
        driver.get("https://v1.training-support.net/selenium");

    }

    @Test
    public void toDoList() {

        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".flingForward()"));
        // Locate element
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='To-Do List']")).click();
        // Wait for the page to load
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.EditText")));

        //--------Enter Tasks--------
        // -------Task1-----
        WebElement taskInput = driver.findElement(AppiumBy.xpath("//android.widget.EditText"));
        taskInput.sendKeys("Add tasks to list");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Add Task']")).click();
        // -------Task2-----
        taskInput.sendKeys("Get number of tasks");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Add Task']")).click();
        // -------Task3-----
        taskInput.sendKeys("Clear the list");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Add Task']")).click();

       // Strike through the tasks
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Add tasks to list']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Get number of tasks']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Clear the list']")).click();

        List<WebElement> taskCard = driver.findElements(AppiumBy.className("android.view.View"));
        //taskCard.size();

        //Clear List
       driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=' Clear List']")).click();


        taskCard = driver.findElements(AppiumBy.className("android.view.View"));
        //taskCard.size();


        // Assertions
        Assert.assertEquals(taskCard.size(), 6);


    }

    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }

}
