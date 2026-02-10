
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/alerts/")
    wait=WebDriverWait(driver,10)
    print(driver.title)
    driver.find_element(By.XPATH,"//*[@id=\"simple\"]").click()
    alert=driver.switch_to.alert 
    print(alert.text)
    alert.accept()
    
    driver.quit
    
