package week3.day1;

public class RemoveDuplicatesStr {

	public static void main(String[] args) {
		
		String text = "java learn java basics as part of java sessions in java week1";
		
		int count = 0;
		
		String[] words = text.split(" ");
		
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				
				 if(words[i].equalsIgnoreCase(words[j]) && !words[i].equals("")) {
					 words[j]= "";
					count++;
				 }
				 
				}
		}
		
		if(count > 0) {
			for(String word : words) {
				if(!word.equals("")) {
					System.out.print(word+" ");
				}
			}
		}else {
			System.out.println("no duplicates found in the given string");
		}
			
	}

}
