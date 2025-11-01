package week3.day1;

import java.util.Scanner;

//to find the reverse of a given String
public class ReverseString {

	public static void main(String[] args) {

		//String strToReverse = "TestLeaf";

		//to read the string to be reversed from console
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string to be reversed : ");
		String strToReverse = sc.nextLine();

		//using charArray to store the string as char
		char[] reverseString = strToReverse.toCharArray();

		//print the char in reverse order
		for(int j=reverseString.length-1;j>=0;j--) {
			System.out.print(reverseString[j]);
		}

	}

}
