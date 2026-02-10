from selenium import webdriver

from selenium.webdriver.common.by import By
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls/")
    print(driver.title)
    print(driver.find_element(By.XPATH,"//*[@id=\"textInput\"]").is_enabled())
    driver.find_element(By.XPATH,"//*[@id=\"textInputButton\"]").click()
    print(driver.find_element(By.XPATH,"//*[@id=\"textInput\"]").is_enabled())
    driver.quit