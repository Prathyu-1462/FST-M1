import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
public class Activity_14 {
	public static void main(String args[]) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/tables");
		System.out.println("page title: "+driver.getTitle());
		
		List<WebElement> column= driver.findElements(By.xpath("//table[contains(@class,'table-auto')]/thead/tr/th"));
		System.out.println("no.of columns:"+column.size());
		List<WebElement> rows= driver.findElements(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr"));
		System.out.println("no.of columns:"+rows.size());
		WebElement row5_col2= driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr[5]/td[2]"));
		System.out.println("book name in row5: "+row5_col2.getText());
		driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/thead/tr/th[5]")).click();
		
		WebElement row5_col2_1= driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr[5]/td[2]"));
		System.out.println("book name in row5_updated: "+row5_col2_1.getText());
		driver.quit();
		
	}
}
