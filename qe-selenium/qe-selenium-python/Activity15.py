from selenium import webdriver
from selenium.webdriver import Firefox
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC


with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-attributes/")
    action=ActionChains(driver)

    print(driver.title)
    driver.find_element(By.XPATH,"//input[starts-with(@type,'text')]").click()
    action.send_keys("Pavan").perform()
    driver.find_element(By.XPATH,"//input[starts-with(@type,'email')]").click()
    action.send_keys("Pavan@g").perform()
    driver.find_element(By.XPATH,"//input[starts-with(@type,'date')]").send_keys("2002-12-12")
    driver.find_element(By.XPATH,"//textarea[contains(@id,'additional-details')]").click()
    action.send_keys("Pavan@g").perform()
    
    driver.find_element(By.XPATH,"//*[@id=\"signInForm\"]/button").click()
    print(driver.find_element(By.XPATH,"//*[@id=\"action-confirmation\"]").text)

