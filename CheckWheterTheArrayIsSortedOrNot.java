package PracticeQuestions;

public class CheckWheterTheArrayIsSortedOrNot {

	public static void main(String[] args) {
		
		  boolean isSorted = true; int[] arr = {11 , 44 , 66 , 77}; for(int i = 0 ; i <
		 arr.length-1 ; i++) { // here we used length -1 coz we want our loop to run n
		  //-1 otherwise it will give error // coz it will be unable to find the last
		 // element of index 5
		  if(arr[i]> arr[i+1]) { isSorted = false; break; } }
		  if(isSorted) { System.out.println("The array is sorted"); }else {
		  System.out.println("The array is not sorted"); }
		 


	}

}
