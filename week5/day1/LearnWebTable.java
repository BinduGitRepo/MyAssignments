package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");

		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//locate the table
		WebElement table = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody"));
		
		//rowcount
		
		 List<WebElement> row =		 driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr"));
		 int rowSize = row.size(); 
		 System.out.println("rowSize=="+rowSize);
		 
		//cloumn count
		 
		List<WebElement> column =	driver.findElements(By.xpath("(//table[@role='grid'])[2]/thead/tr/th"));
		int	columnSize = column.size();
		System.out.println("columnSize==="+columnSize);
		
		String text = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
		
		//entire row
		List<WebElement> singleRow = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr[2]"));
		for (WebElement rowIter : singleRow) {
			System.out.println(rowIter.getText());
			
		}
		//entire data
		List<WebElement> allData = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr/td"));
		for (WebElement each : allData) {
			System.out.println(each.getText());
		}
		//dynamic datas
		
		for (int i = 1; i < row.size(); i++) {
			driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr["+i+"]/td"));
			System.out.println("---------------------");
			for (int j = 1; j <column.size() ; j++) {
				WebElement dynamicDatas = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println(dynamicDatas.getText());
			}
		}

		
	}

}
