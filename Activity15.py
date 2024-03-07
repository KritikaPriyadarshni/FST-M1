from prompt_toolkit.contrib.telnet.protocol import EC
from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.support import expected_conditions, wait
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.core import driver
from webdriver_manager.firefox import GeckoDriverManager

# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())

# Start the Driver
with webdriver.Firefox(service=service) as driver:
    driver.get("https://v1.training-support.net/selenium/dynamic-attributes")
    print("Title:", driver.title)
    username = driver.find_element(By.XPATH, "//input[starts-with(@class,'username-')]")
    password = driver.find_element(By.XPATH, "//input[starts-with(@class,'password-')]")
    username.send_keys("admin")
    password.send_keys("password")

    driver.find_element(By.XPATH, "//button[@type='submit']").click()
    wait.until(expected_conditions.visibility_of_element_located((By.ID,"action-confirmation")))

    message = driver.find_element(By.ID, "action-confirmation").text
    print("Login message: ", message)
