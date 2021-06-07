package PracticeQuestions;

public class LargestSumContiguousSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] arr = {4 , -9 , -6 , 6 , 7 , 2};
  int max_so_far = Integer.MIN_VALUE;
  int max_ending_here = 0;
  int start = 0 , end = 0 , s = 0;
  
  for(int i = 0 ; i < arr.length ; i ++) {
	  max_ending_here = max_ending_here + arr[i];
	  if(max_so_far<max_ending_here) {
		  max_so_far= max_ending_here;
		  start = s;
		  end = i;
	  }
	  if(max_ending_here < 0) {
		  max_ending_here = 0;
		  s = i+1;
	  }
  }
  System.out.println(max_so_far);
  System.out.println("stating position of subarray is" +start + "ending position of subarray is" +end );
	}

}
