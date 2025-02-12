package Activities;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;


public class Activity_3 {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver= new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form/");
	}
	
   
	@Test
	public void test1() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		String Message=driver.findElement(By.cssSelector("h2.mt-5")).getText();
		Assert.assertEquals(Message, "Welcome Back, Admin!");
		
	}
	@AfterClass
	public void closeup() {
		driver.quit();
	}
}
