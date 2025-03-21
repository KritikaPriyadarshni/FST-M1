from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.select import Select
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.core import driver
from webdriver_manager.firefox import GeckoDriverManager

service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    wait = WebDriverWait(driver, 10)

    # Navigate to the URL
    driver.get("https://v1.training-support.net/selenium/tab-opener")
    # Print the title of the page
    print("Page title is: ", driver.title)

    # Print the handle of the current page
    print("Current window handle: ", driver.current_window_handle)
    # Find the link to open a new tab/window and click it

    driver.find_element(By.ID, "launcher").click()

    # Wait for new tab/window to open
    wait.until(expected_conditions.number_of_windows_to_be(2))
    # Print the handles of all the windows
    print("All window handles: ", driver.window_handles)

    # Switch focus to new tab/window
    driver.switch_to.window(driver.window_handles[1])

    # Print the handle of the currently active tab/window
    print("Current window handle: ", driver.current_window_handle)
    # Print the new tab/window title
    print("New Tab title: ", driver.title)
    # Print the new tab/window heading
    #heading = driver.find_element(By.XPATH, "//div[@class='content']")
    heading = driver.find_element(By.CLASS_NAME, "content")
    print(heading.text)

    # For the next tab/window
    # Find the link to open a new tab/window and click it
    driver.find_element(By.ID, "actionButton").click()
    # Wait for new tab/window to open
    wait.until(expected_conditions.number_of_windows_to_be(3))
    # Print the handles of all the windows
    print("All window handles: ", driver.window_handles)

    # Switch focus to new tab/window
    driver.switch_to.window(driver.window_handles[2])

    # Print the handle of the currently active tab/window
    print("Current window handle: ", driver.current_window_handle)
    # Print the new tab/window title
    print("New Tab title: ", driver.title)
    # Print the new tab/window heading
    heading = driver.find_element(By.XPATH, "//div[@class='content']")
    print(heading.text)
