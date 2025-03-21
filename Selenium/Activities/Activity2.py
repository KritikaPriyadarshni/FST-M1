from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.core import driver
from webdriver_manager.firefox import GeckoDriverManager

# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())

# Start the Driver
with webdriver.Firefox(service=service) as driver:
    driver.get(" https://v1.training-support.net/selenium/login-form")
    print("Title:", driver.title)

    driver.find_element(By.ID, 'username').send_keys("admin")
    driver.find_element(By.ID, 'password').send_keys('password')
    driver.find_element(By.XPATH, "//button[text()='Log in']").click()

    message = driver.find_element(By.ID, "action-confirmation").text
    print("Login message: ", message)
    driver.close()



