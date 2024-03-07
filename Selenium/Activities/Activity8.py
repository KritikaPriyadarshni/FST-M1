from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.core import driver
from webdriver_manager.firefox import GeckoDriverManager

# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())

# Start the Driver
with webdriver.Firefox(service=service) as driver:
    driver.get("https://v1.training-support.net/selenium/dynamic-controls")
    print("Title:", driver.title)
    Toggle = driver.find_element(By.ID, "toggleCheckbox")
    Toggle.click()
    Checkbox = driver.find_element(By.ID, "dynamicCheckbox")

    wait = WebDriverWait(driver, 30)
    wait.until(expected_conditions.invisibility_of_element_located(Checkbox))
    Toggle.click()
    print("Toggle clicked")
    driver.implicitly_wait(10)
    # Check.click()
    Check = driver.find_element(By.CLASS_NAME, "willDisappear")
    Check.click()
    if Check.is_selected():
        print("check  clicked")


