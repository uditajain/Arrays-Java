package PracticeQuestions;

import java.util.HashSet;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		int[] ar= {3 , 4 , 4 , 5 , 6 , 7 };
		/*
		//method 1 where we use one extra array to store the array
		int[] temp = new int[ar.length];
		int j = 0 ;
		for(int i = 0 ; i < ar.length-1; i++) {
			if(ar[i] != ar[i+1]) {
				temp[j] = ar[i];
				j++;
			}
		}
		temp[j] = ar[ar.length-1];
		for(int i = 0 ; i < temp.length ; i ++) {
			System.out.println(temp[i] + " ");
		}
		*/
		/*
		//Method2 without using extra array
		int j = 0 ;
		for(int i = 0 ; i < ar.length-1; i++) {
			if(ar[i] != ar[i+1]) {
				ar[j] = ar[i];
				j++;
			}
		}
		ar[j] = ar[ar.length-1];
		for(int i = 0 ; i < j+1 ; i ++) {
			System.out.println(ar[i] + " ");
		}
		*/
		
		//Method 3 by using hash set . This method can also be used to remove dublicates from unsorted array.
		HashSet<Integer> hs = new HashSet<>();
		for(int i = 0 ; i < ar.length ; i ++) {
			hs.add(ar[i]);
			
		}
		for(int no:hs) {
			System.out.println(no + " ");
		}

		
	}

}
