package PracticeQuestions;

public class ReverseAnArray {

	public static void main(String[] args) {
	int [] arr = {22 , 44 , 55 , 6 , 7 , 6};
	int l = arr.length;
	int n = Math.floorDiv(l, 2);
	int temp ;
	for(int i = 0 ; i < n ; i++) {
		temp = arr[i];
		arr[i] = arr[l-i-1];
		arr[l-i-1] = temp;
	}
	for(int element: arr) {
		System.out.println(  element + " " );
	}

	}

}
