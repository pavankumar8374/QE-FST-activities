from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/tabs/")
    print(driver.title)
    driver.find_element(By.XPATH,"/html/body/div/main/div/div/div/div/button").click()
    wait=WebDriverWait(driver,10)
    wait.until(EC.number_of_windows_to_be(2))
    
    

    driver.switch_to.window(driver.window_handles[1])
    handles = driver.window_handles

    for handle in handles:
        print(handle)
    print(driver.title)
