import selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/tables")
    print(driver.title)
    column= driver.find_elements(By.XPATH,"//table[contains(@class,'table-auto')]/thead/tr/th")
    print("no.of column:",len(column))
    row= driver.find_elements(By.XPATH,"//table[contains(@class,'table-auto')]/tbody/tr")
    print("no.of row:",len(row))
    #Find and print all the cell values in the third row of the table.
    row3=driver.find_elements(By.XPATH,"//table[contains(@class,'table-auto')]/tbody/tr[3]/td")
    print("third row:")
    for cell in row3:
        print(cell.text)
    #Find and print the cell value at the second row second column.
    row_colum=driver.find_element(By.XPATH,"//table[contains(@class,'table-auto')]/tbody/tr[2]/td[2]")       
    print("second row second column:",row_colum.text)
    driver.quit()


