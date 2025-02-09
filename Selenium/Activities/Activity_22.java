import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Activity_22 {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/popups");
		System.out.println("main page title: "+driver.getTitle());
		driver.findElement(By.id("launcher")).click();
		WebElement username= wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
		username.sendKeys("admin");
		
		WebElement password= wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
		password.sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("h2.text-center")).getText());
		driver.quit();
	}

}
