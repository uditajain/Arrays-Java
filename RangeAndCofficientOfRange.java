package PracticeQuestions;

public class RangeAndCofficientOfRange {

	public static void main(String[] args) {
		int[] arr = {15, 16, 10, 9, 6, 7, 17} ;
	
		float max=0;
		float min = 2147483647;
		float range = max - min;
		float coffofrange = ((max-min)/(max+min));
		for(int i = 0 ; i < arr.length ; i++) {
			
			
			for( int e: arr) {
				if(e>max) {
				 	max = e;
				}	
			}
				

				for( int f: arr) {
					if(f<min) {
						min = f;
					}
		}
			
		}
		
		System.out.println("range of array is" +range);
		System.out.println("Coff. of range is"+ coffofrange);
		
		
	}

}
