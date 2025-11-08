package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandlingAuto {

	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--guest");

		ChromeDriver driver = new ChromeDriver(chromeOptions);

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Entering login details
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();

		driver.findElement(By.linkText("Contacts")).click();

		driver.findElement(By.linkText("Merge Contacts")).click();

		WebElement fromWidget = driver.findElement(By.xpath("//input[@name='ComboBox_partyIdFrom']/following::img[@alt='Lookup'][1]"));
		fromWidget.click();

		String parentWindow = driver.getWindowHandle();
		
		Set<String> allWindows = driver.getWindowHandles();
		List<String> windowList = new ArrayList<>(allWindows);
		String childWindow1=windowList.get(1);
		driver.switchTo().window(childWindow1);
		WebElement firstRowLink = driver.findElement(By.xpath("//a[text()='11386']"));
		firstRowLink.click();

		driver.switchTo().window(parentWindow);

		WebElement toWidget = driver.findElement(By.xpath("//input[@name='ComboBox_partyIdTo']/following::img[@alt='Lookup'][1]"));
		toWidget.click();

		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> windowList2 = new ArrayList<>(allWindows2);
		String childWindow2=windowList2.get(1);
		driver.switchTo().window(childWindow2);
		WebElement secondRowLink = driver.findElement(By.xpath("//a[text()='11387']"));
		secondRowLink.click();

		driver.switchTo().window(windowList2.get(0));
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		//Accepting Alert
		Alert alert = driver.switchTo().alert();
		//System.out.println(alert.getText());
		alert.accept();
		System.out.println("parentWindow==" + parentWindow + "title ==" + driver.getTitle());

	}
}
