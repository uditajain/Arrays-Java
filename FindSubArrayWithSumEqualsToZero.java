package PracticeQuestions;

import java.util.*;

public class FindSubArrayWithSumEqualsToZero {

	public static void main(String[] args) {
		int[] a = { 2, 1, 3, 4, -2 };
		boolean found = false;
/*
		// Method1
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {
				sum += a[j];
				if (sum == 0) {
					found = true;
					break;
				}
			}
			if (found)
				break;
		}
*/
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for(int element : a) {
			set.add(sum);
			sum+= element;
			if(set.contains(sum)) {
				found = true;
				break;
							}
		} 
		System.out.println(found);

	}
}
