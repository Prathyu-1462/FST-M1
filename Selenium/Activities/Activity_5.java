
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity_5 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Main Page Title: "+driver.getTitle());
		System.out.println("checkbox is enabled:"+driver.findElement(By.id("checkbox")).isDisplayed());
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		
		System.out.println("checkbox is displayed:"+driver.findElement(By.id("checkbox")).isDisplayed());
		
		driver.quit();
		
}
}