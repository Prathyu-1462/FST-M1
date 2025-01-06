from selenium import webdriver
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net")
    print("main page title:",driver.title)
		
    driver.find_element(By.LINK_TEXT, "About Us").click()
    print("new page title: ",driver.title)
    driver.quit()