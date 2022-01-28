package week1.day2.assignments.mandatory;

public class Palindrome {
public static void main(String[] args) {
	String strname =  "Madam";
	String rev = "";

//char[] charArray = strname.toCharArray();
//System.out.println(charArray.length);
	
	for (int i=4; i>=0;i--) {
		rev = rev + strname.charAt(i);
	}
	
	
	if (strname.equalsIgnoreCase(rev)) {
	System.out.println("Its a Paindrome");
			}
	else {
		System.out.println("not a Palindrom");
	}
}
}
