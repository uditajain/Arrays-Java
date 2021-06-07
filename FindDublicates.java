package PracticeQuestions;

public class FindDublicates {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 2, 4, 2, 7 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("The dublicate element are" + arr[j]);
				}
			}
		}

	}

}
