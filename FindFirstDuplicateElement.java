package PracticeQuestions;

public class FindFirstDuplicateElement {

	public static void main(String[] args) {
		int[] a = {9 , 2 , 1 , 2, 4, 5, 6, 5};
		int temp = 0 ;
		for(int i = 0 ; i < a.length ; i ++) {
			for(int j = i + 1; j < a.length ; j ++ ) {
				if(a[i] == a[j] && i != j) {
					temp++;
					System.out.println("The dublicate element is" + a[i]);
					break;
				}
			}
			if(temp > 0 ) {
				break;
			}
		}

	}

}
