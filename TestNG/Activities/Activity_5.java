package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity_5 {
	WebDriver driver;
	@BeforeClass(alwaysRun = true)
	public void beforeclass() {
		driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice");
		
	}
	@Test(groups = {"HeaderTests","ButtonTests"})
	public void test1() {
		Assert.assertEquals(driver.getTitle(),"Selenium: Target Practice");
	}
	
	@Test(dependsOnMethods=("test1"),groups= {"HeaderTests"})
	public void HeaderTest1() {
		String h3=driver.findElement(By.cssSelector("h3.text-3xl")).getText();
		Assert.assertEquals(h3,"Heading #3");
	}
	
	@Test(dependsOnMethods=("test1"),groups= {"HeaderTests"})
	public void HeaderTest2() {
		//Color header5Color = Color.fromString(driver.findElement(By.cssSelector("h5.text-purple-600")).getCssValue("color"));
		Color h5_color=Color.fromString(driver.findElement(By.cssSelector("h5.text-3xl")).getCssValue("color"));
		Assert.assertEquals(h5_color.asHex(),"#9333ea");
	}
	
	@Test(groups= {"ButtonTests"},dependsOnMethods=("test1"))
	public void test1_button() {
		String btn1=driver.findElement(By.className("bg-emerald-200")).getText();
		Assert.assertEquals(btn1,"Emerald");
	}
	@Test(dependsOnMethods = { "test1" }, groups = {"ButtonTests" })
    public void ButtonTest2() {
        Color button2Color = Color.fromString(driver.findElement(By.cssSelector("button.text-purple-900")).getCssValue("color"));
        Assert.assertEquals(button2Color.asHex(), "#581c87");
    }

	@AfterClass(alwaysRun = true)
	public void tearup() {
		driver.quit();
	}
}
