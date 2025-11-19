package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollDown {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in/");
		
		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement scrollDown =driver.findElement(By.xpath("//span[contains(text(),'Amazon.com')]"));
		
		Actions action = new Actions(driver);
		action.scrollToElement(scrollDown).perform();
		
		WebElement clickAction = driver.findElement(By.xpath("//h5[contains(text(),'Business')]"));
		action.click(clickAction).perform();
		
		action.moveByOffset(10, 20).contextClick().perform();

	}

}
