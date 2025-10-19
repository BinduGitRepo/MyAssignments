package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//instantiate the browser driver
		ChromeDriver chromeDriver = new ChromeDriver();
		
		//load the url
		chromeDriver.get("https://www.facebook.com/" );
		
		//maximize the window
		chromeDriver.manage().window().maximize();
		
		//get the title of the page
		String tile = chromeDriver.getTitle();
		System.out.println(tile);
		
		chromeDriver.close();
	}

}
