package Activities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
public class Activity_7 {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void before() {
	driver =new FirefoxDriver();
	 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://training-support.net/webelements/login-form");
	}
	@DataProvider(name = "Credentials")
    public static Object[][] creds() {
        return new Object[][] { 
            { "admin1", "password1", "Invalid credentials" },
            { "wrongAdmin", "wrongPassword", "Invalid credentials" }
        };
    }
	@Test(dataProvider="Credentials")
	public void inputtext(String username,String password, String output_message) {
		WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Submit']"));
        usernameField.clear();
        passwordField.clear();
        // Enter credentials
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
        String loginMessage = driver.findElement(By.id("subheading")).getText();
        Assert.assertEquals(loginMessage, output_message);
	}
	
	@AfterClass
	public void after() {
		driver.quit();
	}
}
