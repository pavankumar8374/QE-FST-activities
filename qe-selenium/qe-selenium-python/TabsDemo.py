from selenium import webdriver
from selenium.webdriver import Firefox
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC


with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/tabs/")
    wait=WebDriverWait(driver,10)
    action=ActionChains(driver)


    print(driver.title)

    original=driver.current_window_handle()
    print("current page title is:",driver.title)
    print('current tab handle is:',original)
    print("available handles :",driver.current_window_handle)
    launcher=driver.find_element(By.XPATH,"//button[text()='open A New Tab']")
    launcher.click()

    # driver.quit