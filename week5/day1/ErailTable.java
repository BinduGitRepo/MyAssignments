package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailTable {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.erail.in");

		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MAS",Keys.ENTER);


		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU",Keys.ENTER);


		WebElement webElement = driver.findElement(By.id("chkSelectDateOnly"));
		if(webElement.isSelected())
		{
			webElement.click();
		}

		List<WebElement> trainList = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr//td[2]"));

		List<String> trainNames = new ArrayList<>();

		for(WebElement trains : trainList) {

			String name = trains.getText().trim();
			System.out.println(trains.getText());
			if(!name.isEmpty()){
				trainNames.add(name);
			}}

		//checking for duplicates
		//Set<String> uniqueNames = new HashSet<>(trainNames);
		Set<String> nameExist = new HashSet<>();
		Set<String> duplicates = new HashSet<>();

		for(String trName :  trainNames)
		{
			if(!nameExist.add(trName)) {
				duplicates.add(trName);
			}

		}
		if(duplicates.size()>0) {

			for(String dupTrName : duplicates){
				System.out.println("duplicate train names ===="+dupTrName);
			}
		}else {
			System.out.println(" No duplicates found");
		}

	}

}
