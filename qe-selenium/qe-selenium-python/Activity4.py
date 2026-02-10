from selenium.webdriver.common.by import By
from selenium import webdriver



with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/target-practice/")
    print(driver.find_element(By.XPATH,"/html/body/div/main/div/div/div/div/div[2]/h3[1]").text)
    print(driver.title)
    driver.quit
