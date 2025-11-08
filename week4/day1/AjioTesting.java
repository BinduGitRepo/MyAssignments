package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AjioTesting {

	public static void main(String[] args) {
		/*
		 * ChromeOptions chromeOptions =new ChromeOptions();
		 * chromeOptions.addArguments("--guest");
		 * 
		 * ChromeDriver driver = new ChromeDriver();
		 * 
		 * driver.get("https://www.ajio.com/");
		 * 
		 * //maximize the browser driver.manage().window().maximize();
		 * 
		 * // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 */
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) " +
                "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.ajio.com/");
        driver.findElement(By.xpath("//input[@name='searchVal'][1]")).sendKeys("bags",Keys.ENTER);
        

	}

}
