import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_12 {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-content");
		System.out.println(driver.getTitle());
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement Click=driver.findElement(By.xpath("//button[text()='Click me!']"));
		Click.click();
		
		if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"),"release"))) 
			System.out.println(driver.findElement(By.id("word")).getText());	
		driver.quit();	
}
}