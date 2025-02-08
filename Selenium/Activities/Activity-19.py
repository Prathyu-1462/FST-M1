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
	confirm= driver.find_element(By.ID,"confirmation")
	confirm.click()
	alert_text=wait.until(EC.alert_is_present())
	print("text in alert: ",alert_text.text)
	alert_text.accept()
	print("result on main page: ",driver.find_element(By.ID,"result").text)
	confirm.click()
	alert_text=wait.until(EC.alert_is_present())
	print("text in alert: ",alert_text.text)
	alert_text.dismiss()
	print("result on main page: ",driver.find_element(By.ID,"result").text)
	driver.quit()
	