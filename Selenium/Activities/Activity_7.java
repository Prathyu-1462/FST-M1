import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity_7 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Main Page Title: "+driver.getTitle());
		WebElement input_text=driver.findElement(By.id("textInput"));
		
		System.out.println("is input text is enabled:"+input_text.isEnabled());
		driver.findElement(By.id("textInputButton")).click();
		//driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		
		System.out.println("is input text is enabled:"+input_text.isEnabled());
		input_text.sendKeys("Selenium_check");
		
        System.out.println(input_text.getDomProperty("value"));

		driver.quit();
		
}
}