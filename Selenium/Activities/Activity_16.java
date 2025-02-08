import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Activity_16 {
	public static void main(String [] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/selects");
		System.out.println("title of the page: "+driver.getTitle());
		
		WebElement options=driver.findElement(By.cssSelector("select.h-10"));
		
		Select singleSelect = new Select(options);
		singleSelect.selectByVisibleText("Two");
		System.out.println("second option: "+singleSelect.getFirstSelectedOption().getText());
		singleSelect.selectByIndex(3);
		System.out.println("third option: "+singleSelect.getFirstSelectedOption().getText());
		singleSelect.selectByValue("four");
		System.out.println("fourth option: "+singleSelect.getFirstSelectedOption().getText());
		List<WebElement> alloptions= singleSelect.getOptions();
		System.out.println("All available options:");
		for(WebElement getoption : alloptions)
			System.out.println(getoption.getText());
		driver.quit();
	}
}
