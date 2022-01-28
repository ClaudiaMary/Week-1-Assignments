package week1.day2.assignments.optional;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss"; 
		
		boolean flag = true;
		
		int lengthtext1 = text1.length();
		int lenghttext2 = text2.length();
		
		if(lengthtext1==lenghttext2) {
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			
	   Arrays.sort(charArray1);
	   Arrays.sort(charArray2);
					
			for (int i =0; i<lengthtext1; i++) {
				if(charArray1[i]!=charArray2[i]) {
					flag= false;
				}
			}
						
				if (flag == true) {
					System.out.println("Its an Anagram");
				}else {
					System.out.println("Its not an Anagram");
				}

}
		
	}
}
