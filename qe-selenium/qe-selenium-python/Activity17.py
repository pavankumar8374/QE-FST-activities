from selenium import webdriver
from selenium.webdriver import Firefox
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.select import Select


with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/selects/")
    action=ActionChains(driver)
    print(driver.title)
    
    dropdown=Select(driver.find_element(By.XPATH,"/html/body/div/main/div/div/div/div/section/div[2]/select"))
    dropdown.select_by_visible_text("HTML")
    dropdown.select_by_index(4)
    dropdown.select_by_index(5)
    dropdown.select_by_index(6)
    dropdown.select_by_value("nodejs")
    dropdown.deselect_by_index(5)
    
    driver.quit