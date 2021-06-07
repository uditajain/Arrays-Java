package PracticeQuestions;

public class SortArrayOf {

	public static void main(String[] args) {
		int[] arr = { 2 , 2 ,0  , 1 , 0 , 2 , 1 , 0};
		int l = 0 ;
		int m = 0;
		int h = arr.length-1;
		for(int i = 0 ; i < arr.length ; i ++) {
		while(m<=h) {
			int temp= 0;
			if(arr[m] == 0) {
				
				temp = arr[m];
				arr[m] = arr[l];
				arr[l] = temp;
				l++;
				m++;
			}
			if(arr[m] == 1) {
				m++;
				
			}
			if(arr[m] == 2) {

				temp = arr[m];
				arr[m] = arr[h];
				arr[h] = temp;
				h--;
			}
			
		}
		System.out.println(arr[i]);
		}

	}

}
