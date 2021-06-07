package PracticeQuestions;

import java.math.BigInteger;

public class FactorialOfLargeNo {

	public static void main(String[] args) {
		
		int num = 100;
		BigInteger factorial = BigInteger.ONE;
		if(num < 0) {
			System.out.println("can not find the factorial of a negative number");
		}
		else if(num <= 1) {
			System.out.printf("%d!= %d" , num , factorial);
			
		} else {
			for(int counter = num ; counter>=2; counter--) {
				factorial = factorial.multiply(BigInteger.valueOf(counter));
				
			}
			System.out.printf("%d! = %d" , num , factorial);
		}
			
		

	}

}
