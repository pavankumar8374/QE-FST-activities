from selenium import webdriver
from selenium.webdriver.common.by import By


with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls/")
    print(driver.title)
    print(driver.find_element(By.XPATH,"//*[@id=\"checkbox\"]").is_displayed())
    driver.find_element(By.XPATH,"/html/body/div/main/div/div/div/div/div[2]/section[1]/button").click()
    print(driver.find_element(By.XPATH,"//*[@id=\"checkbox\"]").is_displayed())
    
    driver.quit