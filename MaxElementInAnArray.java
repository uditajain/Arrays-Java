package PracticeQuestions;

public class MaxElementInAnArray {

	public static void main(String[] args) {
		int[] marks = {44 , 55 , 43 , 77 , 88};
		int max=0;
		
		for( int e: marks) {
			if(e>max) {
				max = e;
			}
		}
  System.out.println("The maximum no. in the array is" + max);
	}

}
