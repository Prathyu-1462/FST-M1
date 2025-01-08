
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity_6 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Main Page Title: "+driver.getTitle());
		driver.findElement(By.id("checkbox")).click();
		System.out.println("checkbox is selected:"+driver.findElement(By.id("checkbox")).isSelected());
		driver.findElement(By.id("checkbox")).click();
		//driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		
		System.out.println("checkbox is selected:"+driver.findElement(By.id("checkbox")).isSelected());
		
		driver.quit();
		
}
}