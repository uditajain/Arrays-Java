package PracticeQuestions;

public class MinNoOfJumpsToReachEnd {
public static int minJumps(int[] arr) {
	if(arr.length == 0) {
		return -1;
	}
	int[] minJumps = new int[arr.length];
	for(int i = 0 ; i < arr.length ; i++) {
		minJumps[i] = Integer.MAX_VALUE;
		
	}
	minJumps[0] = 0;
	for(int i = 0 ; i < arr.length-1 ; i ++) {
		for(int j = i+1; j <= i + arr[i] && j < arr.length ; j++) {
			minJumps[j] = Math.min(minJumps[j] , 1 + minJumps[i]);
		}
	}
	return minJumps[arr.length-1];
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] arr = { 1, 2 , 2 , 3 , 8 , 9 , 3 , 5 , 6};
 System.out.println("Minimun no. of jumps to reach end is" + minJumps(arr));
	}

}
