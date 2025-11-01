package week3.day1;

public class ReverseOddWordsUsingStringBuilder {
	
	public String reverseStringOddPosition(String textToReverse) {
		
		String[] words = textToReverse.split(" ");
		StringBuilder result = new StringBuilder();
		
		for(int i=0;i<words.length;i++)
		{	
			if(i % 2 != 0) { 
				result.append(new StringBuilder(words[i]).reverse());
			 }
			else {
				result.append(words[i]);
			}
			if(i<words.length-1) {
				result.append(" ");
			}
		}
		return result.toString();
	}
 
	
	public static void main(String[] args) {

		ReverseOddWordsUsingStringBuilder oddNumber = new ReverseOddWordsUsingStringBuilder();
		System.out.println(oddNumber.reverseStringOddPosition("I am a software tester"));

	}
}
