package FST_CRM_java_Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        driver.get("http://alchemy.hguy.co/crm");


        // Find the username field and enter the username
        String footer = driver.findElement(By.id("admin_options")).getText();
        // Print the text to the console.
        System.out.println("Footer text is:" + footer);

        // close the browser
        driver.close();

    }

}
