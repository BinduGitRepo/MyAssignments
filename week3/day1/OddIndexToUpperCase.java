package week3.day1;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test = "changeme";
		
		//convert string to character
		char[] charArray = test.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			if(i%2!=0) {
				charArray[i]= Character.toUpperCase(charArray[i]);
			}
		}
		
		//convert character to String
		String convertedString = new String(charArray);
		
		System.out.println("Given String : "+ test + "\n" + "Modified string : "+ convertedString);

	}

}
