import selenium
from selenium import webdriver
from selenium.webdriver.support.select import Select
from selenium.webdriver.common.by import By
with webdriver.Firefox() as driver:
	driver.get("https://training-support.net/webelements/selects")
	print("title of the page: ",driver.title)
		
	options=driver.find_element(By.CSS_SELECTOR,"select.h-10")
		
	singleSelect =Select(options)
	singleSelect.select_by_visible_text("Two")
	
	print("second option: "+singleSelect.first_selected_option.text)
	singleSelect.select_by_index(3)
	print("third option: "+singleSelect.first_selected_option.text)
	singleSelect.select_by_value("four")
	print("fourth option: "+singleSelect.first_selected_option.text)
	alloptions= singleSelect.options
	print("All available options:")
	for option in alloptions:
		print(option.text)
	driver.quit()