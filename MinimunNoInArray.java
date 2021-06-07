package PracticeQuestions;

public class MinimunNoInArray {

	public static void main(String[] args) {
		int[] arr = {44 , 55 , 88 , 99 , 100};
		int min = 2147483647;

		for( int e: arr) {
			if(e<min) {
				min = e;
			}
				
		}  
System.out.println("The minimum element in the array is" + min);  
		
		//this will give us the maximum value
		//System.out.println(Integer.MAX_VALUE);
		
		
	}

}
