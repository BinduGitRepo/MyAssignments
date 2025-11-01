package week3.day1;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		int[] numbers = {1,4,3,2,8,6,7};
		
		Arrays.sort(numbers);
		
		for(int i=0;i<numbers.length;i++) {
			if(i<numbers.length-1) {
				if(numbers[i]+1 != numbers[i+1]) {
				System.out.println(numbers[i]+1);
				}
			}
		}

	}

}
