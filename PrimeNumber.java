package week1.day1.assignments;

public class PrimeNumber {
public static void main(String[] args) {
	int input = 13;
	boolean flag = false;
	float half = input/2;
	for (int i = 2; i <half; i ++) {
		if (input%i==0) {
			flag = true;
			break;
		}
		}
	
	if (flag) {
		System.out.println("Given no. is not a prime");
	}
		else {
			System.out.println("Given no. is a prime");
		}
	}
}

