package PracticeQuestions;

public class Union {
	
	static void printUnion(int arr1[] , int arr2[] , int m , int n) {
		int i = 0 , j = 0;
		
		while( i < m && j < n) {
			if(arr1[i] < arr2[j]) {
				System.out.format("%d" , arr1[i++]);
				
			}else if(arr2[j] < arr1[i]) {
				System.out.format("%d" , arr2[j++]);
			}else {
				System.out.format("%d" , arr2[j++]);
				i++;
			}
		}
		while(i < m ) {
			System.out.format("%d" , arr1[j++]);
		}
		while(j < n ) {
			System.out.format("%d" , arr2[j++] );
		}
		
	}

	public static void main(String[] args) {
		int[] arr1 = {1 , 3 , 4, 5 , 6 };
	    int[] arr2 = {2 , 3, 5 , 7};
	    int m = arr1.length;
	    int n = arr2.length;
	    printUnion(arr1 , arr2 , m , n);
	    //getchar();
	    //return 0 ;
	
		
		

	}

}
