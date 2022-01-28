package week1.day2.classroom.string;

public class CharOccurance {
	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count =0;
		
		char[] charArray = str.toCharArray();
		int arraylength = charArray.length;
		
		for (int i =0;i<arraylength;i++) {
			if (charArray[i]=='e') {
				count = count+1;
			}
		}
		System.out.println("The occurance of e "+count);
	}

}
