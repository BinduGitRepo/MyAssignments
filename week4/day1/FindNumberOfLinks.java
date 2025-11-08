package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindNumberOfLinks {

	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();

		//login as guest
		chromeOptions.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://www.facebook.com/");

		//Maximize the window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//to find the links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			
		//size of the list
		int size = allLinks.size();
		System.out.println(size);
		
		//retrieve
		WebElement linkName7 = allLinks.get(7);
		String text = linkName7.getText();
		System.out.println("text----->"+text);
		

		//for eachloop
		List<String> list = new ArrayList<String>();
		for(WebElement eachElement : allLinks) {
			String text2 = eachElement.getText();
			//System.out.println(eachElement.getText());
			list.add(text2);
		}
		
		System.out.println(list);

	}

}
