from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

# Launch Chrome browser
driver = webdriver.Chrome()

# Navigate to the URL
driver.get("https://www.freecrm.com/")

# Click on Login button
login_button = WebDriverWait(driver, 10).until(EC.presence_of_element_located((By.XPATH, "/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")))
login_button.click()

# Enter Invalid User Name and Password and click on Login button
username_field = WebDriverWait(driver, 10).until(EC.presence_of_element_located((By.XPATH, "//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")))
password_field = driver.find_element(By.XPATH, "//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")
login_button = driver.find_element(By.XPATH, "//div[contains(text(),'Login')]")
username_field.send_keys("invalid_user@example.com")
password_field.send_keys("invalidpassword")
login_button.click()

# Verify that Invalid error message is displayed
invalid_error_msg = WebDriverWait(driver, 10).until(EC.presence_of_element_located((By.XPATH, "//div[contains(text(),'Something went wrong...')]")))
print("Invalid error message displayed:", invalid_error_msg.text)

# Close the browser
driver.quit()
