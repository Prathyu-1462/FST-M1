import selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/selects")
    print(driver.title)
    options=driver.find_element(By.CSS_SELECTOR,"select.h-80")

    multiselect=Select(options)
    multiselect.select_by_visible_text("HTML")
  
    for i in range(3,6):
        multiselect.select_by_index(i)
    multiselect.select_by_value("nodejs")
    all_selected=multiselect.all_selected_options
    print("selected options: ")
    for option in all_selected:
        print(option.text)
    multiselect.deselect_by_index(4)
    print("selected option after diselecting 5th index: ")
    all_selected=multiselect.all_selected_options
    for option in all_selected:
        print(option.text)
    driver.quit()
