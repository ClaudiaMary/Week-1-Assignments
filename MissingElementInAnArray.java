package week1.day2.classroom.arrays;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		//Array Declaration
		int[] arr = {1,2,3,4,6,7,8};
		
		//sorting the array
		Arrays.sort(arr);
		
		int j = 1;
		for ( int i = 0; i<arr.length; i ++) {
			if (arr[i]==j) {
				j++;
			}else {
				System.out.println("The missing number is "+j);
				break;
			}
			}
		}
		
		
	}


