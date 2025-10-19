package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		
		//instantiate the browser driver
		ChromeDriver driver=new ChromeDriver();
		
		//load the URL
		driver.get("https://www.facebook.com");
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//Login credentials
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		//login action
		driver.findElement(By.name("login")).click();
		
		//prints the title of the page loaded
		System.out.println(driver.getTitle());		

	}

}
