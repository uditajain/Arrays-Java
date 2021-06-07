package PracticeQuestions;

import java.util.Arrays;

public class FindPairWithGivenSum {

	public static void main(String[] args) {
		
	int[] arr = {3 , 4 , 5 , 6 , 1 , 2 , 7};
	int l = 0 ; 
	int sum = 9;
	int r = arr.length-1;
	Arrays.sort(arr);
	for (int num: arr) {
        System.out.print(num + " ");
             }
	
	System.out.println(" ");
	for(int i = 0 ; i < arr.length ; i ++) {
		for(int j = i+1 ; j < arr.length ; j++) {
		//	while(l<r) {
				if(arr[i] + arr[j] > sum) {
					r--;
					
				}
				else if(arr[i] + arr[j] < sum) {
					l++;
					
				}
				else {
					l++;
					

					System.out.println("The pairs whose sum is equal are" + arr[i] +"," + arr[j]);
				}
				
	}
	
	}
	
	
	//}

	}
}
