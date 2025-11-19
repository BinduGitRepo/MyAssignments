package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHoverAction {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) " +
                "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://www.snapdeal.com/");
		//driver.get("http://www.macys.com/");

		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement mouseHover=driver.findElement(By.xpath("//span[@class='catText']"));
		//instantiate Action class
		Actions action=new Actions(driver);
		action.moveToElement(mouseHover).perform();//mandatory code perform
		driver.findElement(By.xpath("//span[text()='Casual Shoes']")).click();
	
		
		
		
	}

}
