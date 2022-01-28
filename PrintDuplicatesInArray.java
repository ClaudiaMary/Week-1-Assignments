package week1.day2.classroom.arrays;

import java.util.Arrays;

public class PrintDuplicatesInArray {
public static void main(String[] args) {
	int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	
	int arrlen = arr.length;
	int count;

	for ( int i=0; i <arrlen-1; i++) {
		count = 0;
	
		for(int j = i+1; j<arrlen; j++) {
			if (arr[i]==arr[j]) {
				count = count+1;
			}
		}
		
		if (count>0) {
			System.out.println(count+"-  "+arr[i]);
		}
		
		
	}
	}
}
