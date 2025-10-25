package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	public static void main(String []args) {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("guest mode");

		//login in guest mode
		ChromeDriver driver = new ChromeDriver(chromeOptions);

		driver.get("http://leaftaps.com/opentaps/" );
		driver.manage().window().maximize();

		//Entering login details
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//click the login button
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM")).click();

		//create Account
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();

		//enter the form details
		driver.findElement(By.id("accountName")).sendKeys("Bindu");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");

		driver.findElement(By.id("numberEmployees")).sendKeys("1000");

		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();

		//print the page title
		System.out.println("Page Title : "+ driver.getTitle());

		driver.quit();

	}

}
