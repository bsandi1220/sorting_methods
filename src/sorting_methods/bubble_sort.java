package sorting_methods;

public class bubble_sort {

	
	public static void bubble (int[] arr){
		
		int n = arr.length;
				
		
		for (int i=0 ; i < n ; i++) {
			for (int j = 0 ; j < n -1 ; j++ ) {
				
				if (arr [j] > arr[j+1]) {
					int aux = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = aux;			
				}		
			}	
		}
		
	}
	
	
	
	
	public static void main (String[] args){
		
		int[] arr = { 1, 4 ,2 ,3 , 9 , 98, 8, 7};
		
		bubble(arr);
		
		for(int n = 0; n < arr.length; n++) {
			System.out.println(arr[n]);

		}
		
		
	}
	
	
}
