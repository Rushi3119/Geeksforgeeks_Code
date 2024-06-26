package GFG_CODES_Array;
//return the position of first occurence of k 
//position of first element is considered as 1
public class Searching_number_26_06_Array {

	public static void main(String[] args) {
		
		int[] arr= {9,7,2,16,4};
		int n=5;
		int k=16;
		
		System.out.println(search(arr,n,k));
	}
	public static int search(int[] arr,int n,int k) {
		
		for(int i=0;i<n;i++) {
			if(arr[i]==k) {
				return i+1;
			}
		}
		return -1;
	}
}
