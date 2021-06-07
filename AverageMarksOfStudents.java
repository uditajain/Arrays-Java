package PracticeQuestions;

import java.util.Scanner;

public class AverageMarksOfStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] marks = {77 , 88 , 99 , 100 , 44};
        int average = 0;
        for(int element: marks) {
        	average = average + element / marks.length;
        }
        System.out.println("The average marks are " + average);
	}

}
