from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.core import driver
from webdriver_manager.firefox import GeckoDriverManager

# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())

# Start the Driver
with webdriver.Firefox(service=service) as driver:



    driver.get("https://v1.training-support.net/selenium/drag-drop")
    print("Title:" , driver.title)
    actions = ActionChains(driver)
    Football = driver.find_element(By.ID, "draggable")
    Drag1 = driver.find_element(By.ID, "droppable")
    Drag2 = driver.find_element(By.ID, "dropzone2")

    actions.drag_and_drop(Football, Drag1).perform()
    if Drag1.text.find("Dropped"):
        print("dragged in Dragzone 1")
    actions.drag_and_drop(Football, Drag2).perform()
    if Drag2.text.find("Dropped"):
        print("dragged in Dragzone 2 ")