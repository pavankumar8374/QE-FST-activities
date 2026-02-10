from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.common.action_chains import ActionChains



with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/mouse-events/")
    wait=WebDriverWait(driver,10)
    actions = ActionChains(driver)
    print(driver.title)
    driver.find_element(By.XPATH,"//*[@id=\"stage\"]/div[1]/div[1]/div").click()
    print(driver.find_element(By.XPATH,"//*[@id=\"result\"]").text)
    # wait.until(EC.visibility_of_element_located((By.XPATH,"//*[@id=\"result\"]")))
    driver.find_element(By.XPATH,"//*[@id=\"stage\"]/div[1]/div[2]/div").click()
    print(driver.find_element(By.XPATH,"//*[@id=\"result\"]").text)
    
    actions.double_click(driver.find_element(By.XPATH,"//*[@id=\"stage\"]/div[1]/div[3]/div")).perform()
    actions.click(driver.find_element(By.XPATH,"//*[@id=\"stage\"]/div[1]/div[3]/div")).perform()
    actions.context_click(driver.find_element(By.XPATH,"//*[@id=\"stage\"]/div/div[4]/div")).perform()
    actions.click(driver.find_element(By.XPATH,"//*[@id=\"menu\"]/div/ul/li[1]/button")).perform()
    print(driver.find_element(By.XPATH,"//*[@id=\"result\"]").text)
    

    driver.quit



# from selenium import webdriver
# from selenium.webdriver.common.by import By
# from selenium.webdriver.support import expected_conditions as EC
# from selenium.webdriver.support.ui import WebDriverWait

# driver = webdriver.Firefox()
# driver.get("https://training-support.net/webelements/mouse-events/")

# wait = WebDriverWait(driver, 10)
# print(driver.title)

# driver.find_element(By.XPATH, "//*[@id='stage']/div[1]/div[1]/div").click()

# wait.until(EC.visibility_of_element_located((By.XPATH, "//*[@id='result']")))

# driver.find_element(By.XPATH, "//*[@id='stage']/div[1]/div[2]/div").click()

# driver.quit()
