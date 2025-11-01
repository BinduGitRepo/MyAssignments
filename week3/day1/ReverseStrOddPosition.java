package week3.day1;

public class ReverseStrOddPosition {
	
	public static void main(String[] args) {
		
		//input string to be reversed
		String toBeReversed = "I am a software Tester";
		
		//split the words in the string
		String[] words = toBeReversed.split(" ");
		
		for(int i=0;i<words.length;i++) {
			// check for ODD position 
			if(i % 2 !=0){
				char[] chars = words[i].toCharArray();
				//reverse the words
				for(int j=chars.length-1;j>=0;j--) {
					System.out.print(chars[j]);
				}
			}else {
				System.out.print(words[i]);
			}
			
			// add space between the words
			System.out.print(" ");
		}
	}
}


