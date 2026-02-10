from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as Ex
from selenium.webdriver.common.action_chains import ActionChains

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/keyboard-events/")
    wait=WebDriverWait(driver,10)
    actions=ActionChains(driver)
    print(driver.title)
    # driver.find_element(By.XPATH,"/html/body/div/main/div/div/div/div/div[2]/h1").send_keys("hi")
    driver.find_element(By.XPATH,"/html/body/div/main/div/div/div/div/div[2]/h1").click()
    actions.send_keys("hi").perform()
    print(driver.find_element(By.XPATH,"/html/body/div/main/div/div/div/div/div[2]/h1").text)
    
    driver.quit



# from selenium import webdriver
# from selenium.webdriver.common.by import By
# from selenium.webdriver.support.ui import WebDriverWait
# from selenium.webdriver.support import expected_conditions as EC
# from selenium.webdriver.common.action_chains import ActionChains

# driver = webdriver.Firefox()
# driver.get("https://training-support.net/webelements/keyboard-events/")

# wait = WebDriverWait(driver, 10)
# actions = ActionChains(driver)

# print(driver.title)

# # Click anywhere on the page to focus
# driver.find_element(By.TAG_NAME, "body").click()

# # Send keyboard input
# actions.send_keys("hi").perform()

# driver.quit()
