
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_3 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form");
		System.out.println("Main Page Title: "+driver.getTitle());
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(), 'Success')]")).getText());
		driver.quit();
	}

}