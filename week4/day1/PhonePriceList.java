package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhonePriceList {
	
	public static void main(String[] args) {
		
		ChromeOptions chromeOptions =new ChromeOptions();
		//login guest mode
		chromeOptions.addArguments("--guest");
		
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.amazon.com/");
		
		
		try {
			//maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[@class='a-button-text']")).click();
		
	    driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute'][1]")).sendKeys("Phones");
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	
	    //explicit wait
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));		
		List<WebElement> allPhones = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='a-price-whole']")));
		
	 	System.out.println(allPhones.size());
		
		List<String> list = new ArrayList<String>();
		for(WebElement  eachElement : allPhones )
		{
			String text = eachElement.getText();
			list.add(text);
		}
		System.out.println(list);
		}catch(Exception e) {
			
		}finally {
			driver.quit();
		}
		
	}

}
