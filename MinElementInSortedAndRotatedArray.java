package PracticeQuestions;

public class MinElementInSortedAndRotatedArray {
	
	public static int findMin(int[] arr) {
		//If array has only one element , arr={1}
		if(arr.length == 1) {
			return arr[0];
		}
		int start = 0 ; 
		int end = arr.length-1;
		// if array is sorted
		if(arr[0] < arr[end]) {
			return arr[0];
		}
		while(start <= end) {
			int mid = (start + end)/2;
			if(start < mid && arr[mid] < arr[mid-1]) {
				return arr[mid];
			}else if(end > mid && arr[mid+1] <arr[mid] ) {
				return arr[mid+1];
			}else if(arr[end] > arr[mid]) {
				end = mid -1;
			}else {
				start = mid +1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {11 , 4 , 7 ,8 , 8 , 9 };
        int result = findMin(arr);
        System.out.println(result);
	}

}
