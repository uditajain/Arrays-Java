package PracticeQuestions;

public class InsertElement {

	public static void main(String[] args) {
		int[] arr = {11 , 33 , 44 , 6 , 11 };
		int pos = 3;
		int element = 99;
		//iterate the array from the last and shift the elemnt one to right position and the element would be removed
		for(int i =  arr.length-1; i > pos-1 ; i--) {
			arr[i] = arr[i-1];
			
		}
		//put the given element to the postition
		arr[pos-1] = element;
		
		// print the array
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.println(arr[i]);
		}
	}

}
