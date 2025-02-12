package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.testng.Assert;


public class Activity_1 {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver= new FirefoxDriver();
		driver.get("https://training-support.net");
	}
	
   
	@Test(priority = 1)
	public void test1() {
		
		Assert.assertEquals(driver.getTitle(), "Training Support");
	
		driver.findElement(By.linkText("About Us")).click();
		
	}
	@Test(priority=2)
	public void test2() {
		
		Assert.assertEquals(driver.getTitle(),"About Training Support");
	}
	@AfterClass
	public void closeup() {
		driver.quit();
	}
}
