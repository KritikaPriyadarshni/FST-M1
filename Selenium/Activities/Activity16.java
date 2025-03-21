package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class Activity16 {

        public static void main(String[] args) {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
            System.out.println("Home page title: " + driver.getTitle());

            WebElement userName = driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
            WebElement password = driver.findElement(By.xpath("//input[contains(@class, '-password')]"));
            WebElement confirmPassword = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following-sibling::input"));
            WebElement email = driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));

            userName.sendKeys("KritikaP");
            password.sendKeys("python2!");
            confirmPassword.sendKeys("python2!");
            email.sendKeys("kritikaP@gmail.com");
            driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();

            String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
            System.out.println("Login message: " + loginMessage);


            driver.quit();
        }
    }

