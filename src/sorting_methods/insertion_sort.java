package sorting_methods;

public class insertion_sort {
	//Insertion DO NOT SWAP they are inserted

	public static void insertion (int[] arr){

		int n = arr.length;

		 int temp;
	        for (int i = 1; i < n; i++) {
	            for(int j = i ; j > 0 ; j--){
	                if(arr[j] < arr[j-1]){
	                    temp = arr[j];
	                    arr[j] = arr[j-1];
	                    arr[j-1] = temp;
	                }
	            }
	        }


	}





	public static void main (String[] args){

		int[] arr = { 7,2,5 , 6,4 ,3 , 9 , 98, 8, 7};

		insertion(arr);

		for(int n = 0; n < arr.length; n++) {
			System.out.println(arr[n]);

		}

	}

}