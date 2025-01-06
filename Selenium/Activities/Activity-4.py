from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.color import Color
with webdriver.Firefox () as driver:

		driver.get("https://training-support.net/webelements/target-practice")
		print("Main Page Title: ",driver.title)
		#Find the 3rd header on the page and print it's text to the console.
		print("3rd Header text: ", driver.find_element(By.XPATH, "//h3[contains(text(), '#3')]").text)
		#Find the 5th header on the page and print it's color.
		print("5rd Header colour: ", driver.find_element(By.XPATH, "//h5[contains(text(),'#5')]").value_of_css_property("color"))
		
        #Using any other locator:
		#Find the purple button and print all it's classes.
		print("Purple button classes: ", driver.find_element(By.XPATH, "//button[text()='Purple']").get_dom_attribute("class"))
		
		#Find the slate button and print it's text
		print("slate button text: ", driver.find_element(By.XPATH, "//button[contains(@class, 'slate')]").text)
		driver.quit()