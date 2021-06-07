package PracticeQuestions;

import java.util.Scanner;

public class ConstructNMMatrixWithUserInput {

	public static void main(String[] args) {
	
		//code to get the no. of rows and columns
     Scanner sc = new Scanner(System.in);
     int rows = 0 ; int column = 0 ;
     System.out.println("enter no. of rows");
     rows = sc.nextInt();
     System.out.println("Enter no. of columns");
     column = sc.nextInt();
 	int[][] arr = new int[rows][column];
	 
   //code to code input for the matrix values
	for(int i = 0 ; i < rows; i ++) {
    	 for(int j = 0 ; j < column ; j ++) {
    		 
	       arr[i][j]= sc.nextInt();
    		
    	 }
     }
	//code to print matrix
     System.out.println("mtrix is:");
     for(int i = 0 ; i < rows ; i ++) {
    	 for(int j = 0 ; j < column ; j ++) {
    		 System.out.print(arr[i][j]);
    		 
    	 }
    	 System.out.println();
     }
     
     
     }

}
