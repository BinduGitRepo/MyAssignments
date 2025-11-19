package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrames {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");

		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//handle the outer frame parent tp child frame - outer to inner frame
		WebElement nestFrame = driver.findElement(By.xpath("//h5[contains(text(),'Click Me (Inside Nested frame')]/following-sibling::iframe"));

		//switch to the frame 1
		driver.switchTo().frame(nestFrame);

		//handle the child frame
		driver.switchTo().frame("frame2");

		//click
		driver.findElement(By.id("Click")).click();
	}

}
