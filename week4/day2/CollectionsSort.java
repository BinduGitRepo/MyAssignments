package week4.day2;
import java.util.*;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CollectionsSort {

	public static void main(String[] args) {
		//create list
		List<String> companiesList =new ArrayList<String>();
	
		//add elemenst to the list
		companiesList.add("HCL");
		companiesList.add("Wipro");
		companiesList.add("Aspire Syatems");
		companiesList.add("CTS");
		
		//sort the list in ascending order
		Collections.sort(companiesList);
		
		//print list in descending order
		for(int i=companiesList.size()-1;i>=0;i--)
		{
			System.out.println(companiesList.get(i));
		}

	}

}
