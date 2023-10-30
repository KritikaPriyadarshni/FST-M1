package FST_CRM_java_Project;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        driver.get("http://alchemy.hguy.co/crm");

        //Find and select the username and password fields
        //Enter login credentials into the respective fields
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");

        // Click login
        driver.findElement(By.name("Login")).click();

        WebElement navMenu = driver.findElement(By.id("toolbar"));
        String navColor = navMenu.getCssValue("color");
        System.out.println("color of nav menu:" + navColor);

        driver.close();
    }
}
