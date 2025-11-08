package week4.day2;

//Set interface class assignment

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTofindDuplicates {

	public static void main(String[] args) {

		String companyName = "google";

		char[] charArray = companyName.toCharArray();

		Set<Character> nameUniqueCharacter = new LinkedHashSet<Character>(); 

		for(int i = 0;i <charArray.length;i++) {
			nameUniqueCharacter.add(charArray[i]);
		}

		System.out.println("unique characters present in the string "+companyName+ ":"+nameUniqueCharacter);
	}

}
