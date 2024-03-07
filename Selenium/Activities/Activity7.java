package activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);

        driver.get("https://v1.training-support.net/selenium/drag-drop");
        System.out.println("page title: " + driver.getTitle());

        //football
        WebElement football = driver.findElement(By.id("draggable"));
        //dropzone1
        WebElement dropzone1 = driver.findElement(By.id("droppable"));
        //dropzone2
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

        //drag and drop to dropzone 1
        builder.clickAndHold(football).moveToElement(dropzone1).pause(2000).release().build().perform();

        //drag and drop to dropzone 2
        builder.dragAndDrop(football, dropzone2).build().perform();


        driver.close();
    }
}