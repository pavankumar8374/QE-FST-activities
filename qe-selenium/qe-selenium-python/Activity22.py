from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/popups/")
    print(driver.title)
    driver.find_element(By.ID,"launcher").click()
    wait=WebDriverWait(driver,10)
    wait.until(EC.visibility_of_element_located((By.ID, "signInForm")))
    driver.find_element(By.ID,"username").send_keys("admin")
    driver.find_element(By.ID,"password").send_keys("password")
    driver.find_element(By.XPATH,"//button[text()='Submit']").click()
    wait.until(EC.visibility_of_element_located((By.XPATH, "/html/body/div/main/div/div/div/div/div/h1")))
    print(driver.title)
