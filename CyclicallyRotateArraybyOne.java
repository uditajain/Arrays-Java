package PracticeQuestions;

import java.util.Arrays;

public class CyclicallyRotateArraybyOne {
	static int[] arr = {1 , 2 ,3  , 4 , 5};
	 static void rotate()
	    {
		 //Storing the last element in the x variable and moving each element one step forward and then replace the first element with x
	       int x = arr[arr.length-1], i;
	       for (i = arr.length-1; i > 0; i--)
	          arr[i] = arr[i-1];
	       arr[0] = x;
	    }

	public static void main(String[] args) {
		 
		  
		  System.out.println("Given Array is");
	        System.out.println(Arrays.toString(arr));
	         
	        rotate();
	         
	        System.out.println("Rotated Array is");
	        System.out.println(Arrays.toString(arr));
	}

}
