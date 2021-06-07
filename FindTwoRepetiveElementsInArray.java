package PracticeQuestions;

public class FindTwoRepetiveElementsInArray {
        static void  repeatElement(int arr[] , int n) {
        	int count[] = new int[n];
        	int i ;
        	System.out.println("Repeated elements are : ");
        	for( i = 0 ; i < n ; i++) {
        		if(count[arr[i]] ==1)
        			System.out.println(arr[i] + " ");
        		else 
        			count[arr[i]]++;
        	}
        }
	public static void main(String[] args) {
	//RepeatElement repeat = new RepeatElement();
	int[] arr = {4 , 3, 6 , 2 ,3 , 6, 4 , 1 , 8 };
	int n = arr.length;
	repeatElement(arr , n);

	}

}
