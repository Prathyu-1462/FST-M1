import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println("title: "+driver.getTitle());
		WebElement prompt= driver.findElement(By.id("prompt"));
		prompt.click();
		Alert alert_prompt=driver.switchTo().alert();
		System.out.println("text in alert window: "+alert_prompt.getText());
		alert_prompt.sendKeys("Awesome!");
		alert_prompt.accept();
		System.out.println("result on main page: "+driver.findElement(By.id("result")).getText());
		driver.quit();

	}

}