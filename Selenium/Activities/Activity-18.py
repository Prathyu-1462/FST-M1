import selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.alert import Alert
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
	wait=WebDriverWait(driver,timeout=10)
	driver.get("https://training-support.net/webelements/alerts")
	print("title: ",driver.title)
	Simple= driver.find_element(By.ID,"simple")
	Simple.click()
	alert_simple=wait.until(EC.alert_is_present())
	print("text in alert window: ",alert_simple.text)
	alert_simple.accept()
	print("result on main page: ",driver.find_element(By.ID,"result").text)
	driver.quit()