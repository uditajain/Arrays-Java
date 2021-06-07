package PracticeQuestions;

import java.util.HashSet;

public class FirstNonRepeatingElement {

	public static void main(String[] args) {
		int[] a = {9 , 2 , 1 , 2, 4, 5, 6, 5};
	/*	int temp = 0 ;
		for(int i = 0 ; i < a.length ; i ++) {
			for(int j = i + 1; j < a.length ; j ++ ) {
				if(a[i] != a[j] && i != j) {
					temp++;
					System.out.println("The non dublicate element is" + a[i]);
					break;
				}
			}
			if(temp > 0 ) {
				break;
			}
		} */
		
		
		int temp = -1;
		HashSet<Integer> hs = new HashSet<>();
		for(int i = a.length-1 ;i >= 0 ;  i--) {
			if(hs.contains(a[i])) {
				temp = i ; 
			}else {
				hs.add(a[i]);
			}
		}
		if(temp != -1) {
			System.out.println("the first dublicate elemnt is " + a[temp]);
		}else {
			System.out.println("The element is not found");
		}

	}

}
