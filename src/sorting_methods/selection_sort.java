package sorting_methods;

public class selection_sort {

	// SWAP the values in order to put them in the correct order 
	
	public static void selection (int[] arr){
		
		int n = arr.length;
				
		//Look for the minimum value
	         
	        for (int i = 0; i < n - 1; i++)
	        {
	            int index = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[index]) 
	                    index = j;
	        }
	         //Swap between minimum and the front
	    
	            int smallerNumber = arr[index];  
	            arr[index] = arr[i];
	            arr[i] = smallerNumber;
	        }
	    

	}
	
	
	// Testing second commit 
	
	public static void main (String[] args){
		
		int[] arr = {45,23,11,89,77,98,4,28,65,43};
		
		selection(arr);
		
		for(int n = 0; n < arr.length; n++) {
			System.out.println(arr[n]);

		}
		
		
	}
	
	
}