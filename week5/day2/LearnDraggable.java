package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDraggable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryui.com/draggable");
		
		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//switch to frame
		driver.switchTo().frame(0);
		
		
		WebElement drag = driver.findElement(By.id("draggable"));
			
		Actions action = new Actions(driver);
		//action.dragAndDropBy(drag,50 ,100 ).perform();
		
		//if you dont have the position use getlocation()
		Point location = drag.getLocation();
		int x = location.getX();
		int y = location.getY();
		
		action.dragAndDropBy(drag, x, y).perform();
		
		

	}

}
