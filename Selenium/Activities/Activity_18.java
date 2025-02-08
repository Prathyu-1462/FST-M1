import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println("title: "+driver.getTitle());
		WebElement Simple= driver.findElement(By.id("simple"));
		Simple.click();
		Alert alert_simple=driver.switchTo().alert();
		System.out.println("text in alert window: "+alert_simple.getText());
		alert_simple.accept();
		System.out.println("result on main page: "+driver.findElement(By.id("result")).getText());
		driver.quit();

	}

}
