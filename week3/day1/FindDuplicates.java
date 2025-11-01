package week3.day1;

import java.util.Arrays;

//to find duplicate values in an Array
public class FindDuplicates {

	public static void main(String[] args) {

		//given array
		int num[]= {2,5,7,7,3,2,3,3,9,9,3,5,5,3};

		//sort the array
		Arrays.sort(num);

		for(int i=0;i<num.length;i++) {
			if(i+1 < num.length ) {
				//when i=0
				if(i==0) {
					if(num[i]==num[i+1]) {
						System.out.println(num[i]);
					}
				}else {
					//compare the next and previous value
					if((num[i]==num[i+1]) && (num[i-1] !=num[i+1])) {
						System.out.println(num[i]);
					}
				}
			}
		}

	}
}
