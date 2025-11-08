package week4.day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindSecondLargestNum {

	public static void main(String[] args) {
		
		int num[] = {3,2,11,4,6,7};
		
		Arrays.sort(num);
		
		if(num!=null) {
		int i=num.length;
		System.out.println(num[i-2]);
		}
	}

}
