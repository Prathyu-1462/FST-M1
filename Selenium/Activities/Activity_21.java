import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;
public class Activity_21 {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/tabs");
		System.out.println("main page title: "+driver.getTitle());
		System.out.println("window1 handler: "+driver.getWindowHandle());
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Open A New Tab']"))).click();
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));

	    System.out.println("currently open windows: "+driver.getWindowHandles());
	    for(String handle: driver.getWindowHandles()) {
	    	driver.switchTo().window(handle);
	    	
	    }
	    System.out.println("second page title: "+driver.getTitle());
	    System.out.println("window2 handler: "+driver.getWindowHandle());
	    System.out.println(driver.findElement(By.cssSelector("h2.mt-5")).getText());
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Open Another One']"))).click();
	    
	    wait.until(ExpectedConditions.numberOfWindowsToBe(3));
	    System.out.println("currently open windows: "+driver.getWindowHandles());
	    for(String handle: driver.getWindowHandles()) {
	    	driver.switchTo().window(handle);
	    	
	    }
	    System.out.println("Current tab: " + driver.getWindowHandle());
	    System.out.println("3rd page title: "+driver.getTitle());
	    System.out.println(driver.findElement(By.cssSelector("h2.mt-5")).getText());
	    driver.findElement(By.xpath("//button[text()='Open Another One']")).click();
	    wait.until(ExpectedConditions.numberOfWindowsToBe(4));
	    
	    driver.quit();
	}
	

	}


