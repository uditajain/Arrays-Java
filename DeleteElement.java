package PracticeQuestions;

public class DeleteElement {

	public static void main(String[] args) {
		int[] aa = {88 , 99 , 44 , 66 };
		int element = 99;
		int count = 0;
		//check the array from starting and if the element we want to deleted is found then replace that element the element PREsent at next position
		for(int i = 0 ; i < aa.length - 1 ; i ++) {
			if(element == aa[i]) {
				for( int j = i ; j < aa.length-1 ; j ++) {
					aa[j] = aa[j+1];
				}
				// this count will inc if the element is deleted 
				count = count + 1;
				break;
			}
		}
		// if count is 0 means the element is not found
		if(count == 0 ) {
			System.out.println("Element not found");
		}
		for ( int i = 0 ; i < aa.length-1 ; i ++) {
			System.out.println(aa[i] + " ");
		}

	}

}
