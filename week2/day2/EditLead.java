package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		
		chromeOptions.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		//Entering login details
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");

				//click the login button
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.partialLinkText("SFA")).click();
		
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();

				//adding mandatory fields
				driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Bindu");
				driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("S");
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("sbindu");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("QA Selenuim testing");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sbindu1@yahoo.com");
				
				WebElement stateDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select stateDD = new Select(stateDropDown);
				stateDD.selectByVisibleText("New York");
				
				//Create Lead
				driver.findElement(By.className("smallSubmit")).click();
				
				//EDIT LEAD
				driver.findElement(By.linkText("Edit")).click();
				
				//Clear description field
				driver.findElement(By.id("updateLeadForm_description")).clear();
				
				driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Edit testing");
				
				//click update button
				driver.findElement(By.className("smallSubmit")).click();
				
				//print page title
				System.out.println("Page Title" + driver.getTitle());
				
	}

}
