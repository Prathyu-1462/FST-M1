from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-attributes")
    print(driver.title)
    wait = WebDriverWait(driver, timeout=10)
    fullname= driver.find_element(By.XPATH,"//input[contains(@id,'full-name-')]")
    email=driver.find_element(By.XPATH,"//input[contains(@name,'-email')]")
    date=driver.find_element(By.XPATH,"//input[contains(@name,'-event-date-')]")
    Add_details=driver.find_element(By.XPATH,"//textarea[contains(@id,'-additional-details-')]")

    fullname.send_keys("prathyusha")
    email.send_keys("example@gmail.com")
    date.send_keys("2025-06-26")
    Add_details.send_keys("asddfdfdf")

    driver.find_element(By.XPATH,"//button[text()='Submit']").click()
    msg=wait.until(EC.visibility_of_element_located((By.ID,"action-confirmation"))).text
    print(msg)
    driver.quit()