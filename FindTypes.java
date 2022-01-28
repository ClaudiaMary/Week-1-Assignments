package week1.day2.classroom.string;

public class FindTypes {
	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0;
		int space = 0;
		int num = 0;
		int specialChar = 0;
		
		char[] charArray= test.toCharArray();
		int lengtharray = test.length();
		System.out.println(lengtharray);
		
		for (int i =0; i <lengtharray; i ++) {
			//System.out.println(charArray[i]);
			if (Character.isLetter(charArray[i])) {
				letter = letter+1;
							}
			else {
				if (Character.isDigit(charArray[i])) {
					num = num+1;
				}
				else {
					if(Character.isSpace(charArray[i])) {
						space = space +1;
					}
					else {
						specialChar = specialChar+1;
					}
				}
			}
	}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}

}
