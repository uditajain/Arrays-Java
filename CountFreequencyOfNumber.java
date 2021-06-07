package PracticeQuestions;

public class CountFreequencyOfNumber {

	public static void main(String[] args) {
		int[] arr = {2 , 4 , 4 , 4, 1 , 8};
				int x = 8;
				int count = 0;

		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == x ) {
				count++;
			}
			
		}
		System.out.println(count);

	
	}

}
