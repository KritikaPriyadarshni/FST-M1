package activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net");
        System.out.println("Title:" + driver.getTitle());

        WebElement aboutUs = driver.findElement(By.id("about-link"));
        aboutUs.click();
        System.out.println("Title of new page:" + driver.getTitle());





    }
}
