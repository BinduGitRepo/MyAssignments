package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class DropDownElementUsage {

	public static void main(String[] args) {

		ChromeOptions chromeOptions = new ChromeOptions();

		//login as guest
		chromeOptions.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(chromeOptions);

		driver.get("http://leaftaps.com/opentaps/control/main");

		//Maximize the window
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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bindu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");

		//select Employee from the drop down using index
	    WebElement sourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));

		//instantiate the select class
		Select employeeOption = new Select(sourceDropDown);
		employeeOption.selectByIndex(4);

		//select Automobile in the Marketing Campaign (using visibleText)
		WebElement markCampaignDropDown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select markCampSelect = new Select(markCampaignDropDown);
		markCampSelect.selectByVisibleText("Automobile");

		//select Corporation in Ownership (using value)
		WebElement ownerShipDropDown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select OwnerShipSelect = new Select(ownerShipDropDown);
		OwnerShipSelect.selectByValue("OWN_CCORP");

		//submit the form by clicking Create Lead button
		driver.findElement(By.className("smallSubmit")).click();

		//get the current page title and print in the console
		System.out.println("Page Title: "+driver.getTitle());

		driver.quit();	

	}

}
