import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity_10 {
	public static <WebElements> void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/drag-drop");
		System.out.println(driver.getTitle());
		Actions builder= new Actions(driver);
		WebElement ball= driver.findElement(By.id("ball"));
		ball.click();
		WebElement box1=driver.findElement(By.id("dropzone1"));
		builder.clickAndHold(ball).moveToElement(box1).pause(2000).release().build().perform();
		if(box1.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
			System.out.println("Dropped in box1!");
			
		}
		else {
			System.out.println("not dropped in box1!");
		}
		WebElement box2=driver.findElement(By.id("dropzone2"));
		
		builder.clickAndHold(ball).moveToElement(box2).pause(2000).release().build().perform();
		if(box2	.findElement(By.className("dropzone-text")).getText().equals("Dropped!") ){
			System.out.println("Dropped in box2!");
			
		}
		else {
			System.out.println("not droppedin box2!");
		}
		
	driver.quit();
}
}
