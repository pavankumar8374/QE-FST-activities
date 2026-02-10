from selenium import webdriver
from selenium.webdriver import Firefox
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC


with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/tables/")
    print(driver.title)
    rows=driver.find_elements(By.XPATH,"/html/body/div/main/div/div/div/div/div[2]/table/tbody/tr")
    columns=driver.find_elements(By.XPATH,"/html/body/div/main/div/div/div/div/div[2]/table/tbody/tr[1]/td")
    print(len(rows),len(columns))
    for i in range(1,len(columns)):
        print(columns[i].text)
    print(driver.find_element(By.XPATH,"/html/body/div/main/div/div/div/div/div[2]/table/tbody/tr[5]/td[2]").text)
    b=driver.find_element(By.XPATH,"/html/body/div/main/div/div/div/div/div[2]/table/thead/tr/th[5]")
    b.click()
    driver.quit
