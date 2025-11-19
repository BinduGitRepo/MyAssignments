package week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AmazonAutoAction {

	public static void main(String[] args) throws IOException {

		ChromeOptions chromeOptions = new ChromeOptions();
		// login guest mode
		chromeOptions.addArguments("--guest");

		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.get("http://www.amazon.in/");

		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//input[@id ='twotabsearchtextbox']")).sendKeys("oneplus 9 pro", Keys.ENTER);

		WebElement firstTitle = driver.findElement(By.xpath("(//h2[contains(@class,'a-size-medium')]/span)[1]"));

		System.out.println(firstTitle.getText());

		WebElement price = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]"));
		

		WebElement ratings = driver.findElement(By.xpath("(//span[@class='a-size-small a-color-base'])[1]"));
		
		Integer priceCheck = Integer.parseInt(price.getText().replaceAll("[^0-9]", ""));
		System.out.println("Ratings=== " + ratings.getText());

				
		Actions actions = new Actions(driver);

		//locate element
		WebElement element = driver.findElement(By.partialLinkText("7SEVEN® Back Cover for OnePlus 9"));

		//Hover over the element
		actions.moveToElement(element).perform();
		
		//driver.findElement(By.partialLinkText("7SEVEN® Back Cover for OnePlus 9")).click();
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		// connect source and destination
		File destination = new File("./snaps/amazonScreenShot.png");
		FileUtils.copyFile(source, destination);
		
				 
		 driver.findElement(By.xpath("(//button[@name='submit.addToCart'])[1]")).click();
		 
		  WebElement subTotal1 = driver.findElement(By.xpath("//h2[@class='a-size-base a-color-price a-text-bold'][1]")); 
		  Integer  subTotal2 = Integer.parseInt(subTotal1.getText().replaceAll("[^1-9]", ""));
		  
		  System.out.println(	"First product title=== " + firstTitle.getText() + "\n Price of the first product==" + price.getText());
		  System.out.println("Subtotal === "+ subTotal2);
		
		  if(priceCheck.equals(subTotal2))
		  	{
			  System.out.println("Cart subtotal price is correct");		  
		  	}else
		  	{ 
		  		System.out.println("Cart subtotal price is incorrectl"); 
		  	}
		  
		  driver.quit();
		 
	}

}
