package PracticeQuestions;

import java.util.Scanner;

public class FindIntegerIsPresentOrNot {

	public static void main(String[] args) {
	  int[] marks = {12 , 3 , 4 , 6 };
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter your no. here that you want to check in the array");
	  int number = sc.nextInt() ;
	  boolean isInArray = false;
	for(float element:marks) {
		if(number==element)
		{
			isInArray = true;
			break;
		}
	}
	if(isInArray) {
		System.out.println("The element is present in the array");
	}else {
		System.out.println("The element is not present in the array");
	}

	}

}
