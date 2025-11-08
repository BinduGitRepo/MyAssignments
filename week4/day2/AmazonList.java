package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonList {

	public static void main(String[] args) {

		
		ChromeOptions chromeOptions =new ChromeOptions();
		//login guest mode
		chromeOptions.addArguments("--guest");
		
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.amazon.in/");
		
		
		try {
			//maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);
		
		/*driver.findElement(By.xpath("//button[@class='a-button-text']")).click();
		
	    driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute'][1]")).sendKeys("Phones");
	    
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();*/
	
	    //explicit wait
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));		
		List<WebElement> allPhones = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='a-price-whole']")));
		
	 	System.out.println(allPhones.size());
		//create empty List
		List<Integer> list = new ArrayList<Integer>();
		for(WebElement  eachElement : allPhones )
		{
			String text = eachElement.getText();
			String replaceAll = text.replaceAll(",", "");
			//convert String to Integer
			if(!replaceAll.isEmpty()) {
				int mob = Integer.parseInt(replaceAll);
				list.add(mob);
			}
			
		}
		Collections.sort(list);
		System.out.println(list);
		}catch(Exception e) {
			
		}finally {
			driver.quit();
		}
		
	
	}

}
