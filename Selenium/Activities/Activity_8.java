import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Activity_8 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        // Create the Actions object
        Actions builder = new Actions(driver);

		driver.get("https://training-support.net/webelements/mouse-events");
		System.out.println("Main Page Title: "+driver.getTitle());
		WebElement e=driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
		WebElement e1=driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
		WebElement se2 = driver.findElement(By.xpath("//h1[text()='src']"));
        WebElement targetButton = driver.findElement(By.xpath("//h1[text()='target']"));
        //Left click on the Cargo.lock button, move the cursor to the Cargo.toml button and then click it. Print the confirmation text at the end of the sequence.
		
		builder.click(e).pause(1000).moveToElement(e1).pause(2000).click(e1).build().perform();
		System.out.println( driver.findElement(By.id("result")).getText());
		//Double click on the src button. Then right click on the target button and select open. Print the confirmation text at the end of the sequence.
		//Close the browser.
		builder.doubleClick(se2).pause(1000).contextClick(targetButton).pause(2000).build().perform();
		driver.findElement(By.xpath("//div[@id='menu']/div/ul/li[1]")).click();
		System.out.println(driver.findElement(By.id("result")).getText());
		driver.quit();
		
}
}