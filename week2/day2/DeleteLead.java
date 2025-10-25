package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DeleteLead {

	public static void main(String[] args) {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
       //maximize the window
		driver.manage().window().maximize();
		
		//Entering login details
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
				
		//click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		
		//Click Leads tab and then click Find Leads
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		//click the Phone tab and enter the phone number to search
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		
    	// From the result table  select the Lead ID that has to be deleted		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement firstRowLink = wait.until(
		    ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='10094']"))
		);
		firstRowLink.click();
		
		//delete the row with the LEAD ID
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		//check by entering the ID that was deleted
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10094");
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Verify the presence of the message "No records to display" in the Lead List
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement firstRowLink1 = wait2.until(
		    ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='10094']"))
		);
		
		//close the browser
		driver.quit();
		

	}

}
