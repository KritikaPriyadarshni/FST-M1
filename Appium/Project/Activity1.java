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

public class activityGTask {

    AndroidDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        //*********
        options.noReset();
        //*********

        // Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    }

    @Test
    public void googleTask() {

        //-------Create task-------
       //driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button"));
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("Create new task")));
        //--------add task 1--------
        WebElement addTask = driver.findElement(AppiumBy.accessibilityId("Create new task"));
        addTask.click();
        // Wait for elements to load
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("add_task_title")));
        driver.findElement(AppiumBy.id("add_task_title")).sendKeys("Complete Activity with Google Tasks");
        //save
        WebElement clickSave = driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done"));
        clickSave.click();


        //--------add task 2--------
        driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
        // Wait for elements to load
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("add_task_title")));
        driver.findElement(AppiumBy.id("add_task_title")).sendKeys("Complete Activity with Google Keep");
        //save
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();


        //--------add task 3---------
        driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
        // Wait for elements to load
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("add_task_title")));
        driver.findElement(AppiumBy.id("add_task_title")).sendKeys("Complete the second Activity Google Keep");
        //save
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();

        //-------Check for added task---------
        //WebElement taskList = driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/tasks_list"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.google.android.apps.tasks:id/tasks_list")));

        // Find the result //Assertion
        String task3 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text= 'Complete the second Activity Google Keep']")).getText();
        Assert.assertEquals(task3, "Complete the second Activity Google Keep");

        String task2 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text= 'Complete Activity with Google Keep']")).getText();
        Assert.assertEquals(task2, "Complete Activity with Google Keep");

        String task1 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text= 'Complete Activity with Google Tasks']")).getText();
        Assert.assertEquals(task1, "Complete Activity with Google Tasks");


    }

    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}




