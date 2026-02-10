from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/drag-drop/")
    action=ActionChains(driver)
    wait=WebDriverWait(driver,10)
    print(driver.title)
    ball=driver.find_element(By.XPATH,"//*[@id=\"ball\"]")
    d1=driver.find_element(By.XPATH,"//*[@id=\"dropzone1\"]")
    
    d2=driver.find_element(By.XPATH,"//*[@id=\"dropzone2\"]")
    action.drag_and_drop(ball,d1).perform()
    print(driver.find_element(By.XPATH,"//*[@id=\"dropzone1\"]/span").text+" in dropdown1")
    action.drag_and_drop(ball,d2).perform()
    print(driver.find_element(By.XPATH,"//*[@id=\"dropzone2\"]/span").text+" in dropdown2")
    driver.quit