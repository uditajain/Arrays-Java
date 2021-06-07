package PracticeQuestions;

public class LongestAlternatingSubsequence {

    // Function for finding
    // longest alternating
    // subsequence
    static int LAS(int[] arr, int n)
    {
         
        // "inc" and "dec" intialized as 1,
        // as single element is still LAS
        int inc = 1;
        int dec = 1;
       
        // Iterate from second element
        for (int i = 1; i < n; i++)
        {
           
            if (arr[i] > arr[i - 1])
            {
                // "inc" changes iff "dec"
                // changes
                inc = dec + 1;
            }
            else if (arr[i] < arr[i - 1])
            {
                 
                // "dec" changes iff "inc"
                // changes
                dec = inc + 1;
            }
        }
       
        // Return the maximum length
        return Math.max(inc, dec);
    }
   
    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 99, 3, 9,
                               5, 3 };
        int n = arr.length;
       
        // Function Call
        System.out.println(LAS(arr, n));
    }
}
