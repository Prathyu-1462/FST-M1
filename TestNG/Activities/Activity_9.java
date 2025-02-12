package Activities;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_9 {
	WebDriver driver;
	@Test(priority = 1)
	public void simpleAlertTestCase() {
		Reporter.log("simpleAlertTestCase() started |");
		driver.findElement(By.id("simple")).click();
		Reporter.log("simpleAlertTestCase() opened |");
		Alert simplealert=driver.switchTo().alert();
		String simple_alert= simplealert.getText();
		 Reporter.log("Alert text is: " + simple_alert + " |");
		Assert.assertEquals(simple_alert,"You've just triggered a simple alert!");
		simplealert.accept();
		 Reporter.log("Alert closed");
		 
	     Reporter.log("Test case ended |");
	}
	@Test(priority = 2)
	public void confirmAlertTestCase() {
		Reporter.log("confirmAlertTestCase() started |");
		driver.findElement(By.id("confirmation")).click();
		Reporter.log("confirmAlertTestCase() opened |");
		Alert confirmalert=driver.switchTo().alert();
		String confirm_alert= confirmalert.getText();
		 Reporter.log("Alert text is: " + confirm_alert + " |");
		Assert.assertEquals(confirm_alert,"You've just triggered a confirmation alert!");
		confirmalert.accept();
		 Reporter.log("Alert closed");
		 
	     Reporter.log("Test case ended |");
	}
	@Test(priority = 3)
	public void promptAlertTestCase() {
		Reporter.log("promptAlertTestCase() started |");
		driver.findElement(By.id("prompt")).click();
		Reporter.log("promptAlertTestCase() opened |");
		Alert promptalert=driver.switchTo().alert();
		String prompt_alert= promptalert.getText();
		 Reporter.log("Alert text is: " + prompt_alert + " |");
		Assert.assertEquals(prompt_alert,"I'm a Prompt! Type something into me!");
		promptalert.sendKeys("Awesome!");
		promptalert.accept();
		 Reporter.log("Alert closed");
		 
	     Reporter.log("Test case ended |");
	}
	@BeforeClass
	public void before() {
		driver= new FirefoxDriver();
		driver.get("https://training-support.net/webelements/alerts");
	}
	
	@BeforeMethod
	public void method() {
		Reporter.log("Test Case Setup started |");
        driver.switchTo().defaultContent();
	}
	@AfterClass
	public void after() {
		driver.quit();
	}

}

