import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class Activity_13 {
	public static void main(String[]args) {
		WebDriver driver=new FirefoxDriver();
		
	    driver.get("https://training-support.net/webelements/tables");
	    System.out.println("page_title"+driver.getTitle());
	  List<WebElement> column= driver.findElements(By.xpath("//table[contains(@class,'table-auto')]/thead/tr/th"));
	    System.out.println("no.of column:"+column.size());
	    List<WebElement> row= driver.findElements(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr"));
	    System.out.println("no.of row:"+row.size());
	    //Find and print all the cell values in the third row of the table.
	    List <WebElement> row3=driver.findElements(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr[3]/td"));
	    System.out.println("third row:");
	    for(WebElement cell:row3)
	       System.out.println(cell.getText());
	    //Find and print the cell value at the second row second column.
	    WebElement row_col= driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr[2]/td[2]"));       
	   System.out.println("second row second column:"+ row_col.getText());
	    driver.quit();
}
}
