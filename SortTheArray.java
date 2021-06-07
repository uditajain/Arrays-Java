package PracticeQuestions;

public class SortTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] marks = { 99, 55, 66, 88, 11 };
		int temp;
		for (int i = 0; i < marks.length; i++) {
			for (int j = i + 1; j < marks.length; j++) {
				if (marks[i] > marks[j]) {
					temp = marks[i];
					marks[i] = marks[j];
					marks[j] = temp;
				}
				
			}
			System.out.println(marks[i]);

			
		}
	

	}

}
