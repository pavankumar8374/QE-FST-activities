from selenium.webdriver.common.by import By
from selenium import webdriver

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net")
    
    driver.find_element(By.XPATH,'/html/body/div/main/div/div/main/a').click()
    print(driver.title)
    driver.quit

