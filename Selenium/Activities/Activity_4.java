import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity_4 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice");
		System.out.println("Main Page Title: "+driver.getTitle());
		//Find the 3rd header on the page and print it's text to the console.
		System.out.println("3rd Header text: "+ driver.findElement(By.xpath("//h3[contains(text(),'#3')]")).getText());
		//Find the 5th header on the page and print it's color.
		System.out.println("5rd Header colour: "+ driver.findElement(By.xpath("//h5[contains(text(),'#5')]")).getCssValue("color"));
		
		//Using any other locator:
		//Find the purple button and print all it's classes.
		System.out.println("Purple button classes: "+ driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class"));
		
		//Find the slate button and print it's text
		System.out.println("slate button text: "+ driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText());
		driver.quit();

	}

}
