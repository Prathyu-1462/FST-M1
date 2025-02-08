import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Activity_11{
	public static void main(String []args) {
		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println(driver.getTitle());
		
		WebElement checkbox=driver.findElement(By.id("checkbox"));
		
		System.out.println("checkbox is visible? "+ checkbox.isDisplayed());
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(checkbox)).click();
		
		System.out.println("Checkbox is selected? "+ checkbox.isSelected());
		driver.quit();
		
		
	}
}


/*public class Activity_11 {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println(driver.getTitle());
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement Checkbox=driver.findElement(By.id("checkbox"));
		System.out.println("Checkbox is visible? " + Checkbox.isDisplayed());
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		wait.until(ExpectedConditions.invisibilityOf(Checkbox));
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		//wait.until(ExpectedConditions.visibilityOf(Checkbox));
		//Checkbox.click();
		wait.until(ExpectedConditions.elementToBeClickable(Checkbox)).click();
        // Check if it is selected
        System.out.println("Checkbox is selected? " + Checkbox.isSelected());
		driver.quit();
		
}
}*/