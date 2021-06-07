package PracticeQuestions;

import java.util.Arrays;

public class KthSmallestAndLargestElement {

	public static void main(String[] args) {

		int[] arr = { 66, 11, 44, 99, 22 };
		int k = 3;
		int n = arr.length;
		int temp;
		// this program is for finding kth smallest element
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				if (i == k - 1) {
					System.out.println("The smallest element on kth position is" + arr[i]);
					break;
				}
			}

		}

		// to find kth largest element
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				if (i == k - 1) {
					System.out.println("The largest element on kth position is" + arr[i]);
					break;
				}
			}

		}

	}

}
