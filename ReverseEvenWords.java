package week1.day2.assignments.mandatory;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String[] words1 = {"I","am","a","software","tester"};
		int wordlength = words1.length;
		System.out.println(wordlength);
		for ( int i = 1; i<wordlength; i ++) {
			int windex = words1[i].indexOf(i);
			System.out.println(windex);
		}
		//for (int i =0;i<wordlength; i++) {
			//words1[i].indexOf(i)
		//}
				
		
	}

}
