package PracticeQuestions;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr = {1 , 2 , 3 , 5 , 6};
		/*
		//This is the first method by using the sum property of java
		int expected_No_Of_Elements = arr.length+1;
		//This is the formula in the java to find the sum of the expected array
		int total_sum = expected_No_Of_Elements*(expected_No_Of_Elements+1)/2;
		int sum = 0;
		//Find th esum of the given array
		for(int i = 0 ; i < arr.length ; i ++) {
			sum = sum + arr[i];
			
		}
		System.out.println(total_sum);
		System.out.println(sum);
		System.out.println("The missing number is " + (total_sum - sum));
		*/
		
		
		
		
		//By using X-or
		// find the xor of the array
  
		int xor1 = arr[0];
		for(int i = 1 ; i < arr.length ; i ++) {
			xor1 = xor1 ^ arr[i];
		}
		//find the xor of the expected array
		int xor2 = 1;
		for(int i = 2 ; i <= (arr.length+ 1) ; i ++){
	xor2 = xor2 ^ i;
		}
		//xor of xor1 nd xor2 to find the missing element
		System.out.println("The missing element is " + (xor1 ^ xor2));
		

	}

}
