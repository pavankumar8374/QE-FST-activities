from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-content/")
    wait=WebDriverWait(driver,10)
    print(driver.title)
    button=driver.find_element(By.XPATH,"//*[@id=\"genButton\"]")
    button.click()
    content=driver.find_element(By.XPATH,"//*[@id=\"word\"]")
    wait.until(EC.text_to_be_present_in_element((By.ID,'word'),"soccer"))
    driver.quit