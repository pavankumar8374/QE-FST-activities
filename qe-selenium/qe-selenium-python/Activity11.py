from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.action_chains import ActionChains


with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls/")
    wait=WebDriverWait(driver,10)
    print(driver.title)
    checkbox=driver.find_element(By.XPATH,"//*[@id=\"checkbox\"]")
    tooglebox=driver.find_element(By.XPATH,"/html/body/div/main/div/div/div/div/div[2]/section[1]/button")
    tooglebox.click()
    wait.until(EC.invisibility_of_element(checkbox))
    tooglebox.click()
    # wait.until(EC.visibility_of_element_located(By.ID,'checkbox'))
    checkbox.click()
    driver.quit



# from selenium import webdriver
# from selenium.webdriver.common.by import By
# from selenium.webdriver.support.ui import WebDriverWait
# from selenium.webdriver.support import expected_conditions as EC

# driver = webdriver.Firefox()
# driver.get("https://training-support.net/webelements/dynamic-controls/")

# wait = WebDriverWait(driver, 10)
# print(driver.title)

# toggle = driver.find_element(By.XPATH, "//section[1]/button")

# # Remove checkbox
# toggle.click()
# wait.until(EC.invisibility_of_element_located((By.ID, "checkbox")))

# # Add checkbox back
# toggle.click()
# wait.until(EC.visibility_of_element_located((By.ID, "checkbox")))

# # Re-locate checkbox AFTER it is added
# checkbox = driver.find_element(By.ID, "checkbox")
# checkbox.click()

# driver.quit()
