
from selenium import webdriver
from selenium.webdriver.common.by import By
with webdriver.Firefox () as driver:
    driver.get("https://training-support.net/webelements/login-form/")
    print("main page title: ",driver.title)
    driver.find_element(By.NAME,"username").send_keys("admin")
    driver.find_element(By.NAME,"password").send_keys("password")
    login = driver.find_element(By.XPATH,"//button[text()='Submit']")
    login.click()
   
    print("Login message: ",  driver.find_element(By.CSS_SELECTOR, "h1.text-center").text)
   # driver.quit()
