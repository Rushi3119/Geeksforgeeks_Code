package GFG_CODES_Array;
//print the duplicate elements from the array
import java.util.ArrayList;
import java.util.Arrays;

public class Array_Duplicates_Print_01_07_Array {

	public static void main(String[] args) {
		
		int[] arr= {1,2,6,76,23,23,43,43};
		int n=8;
		System.out.println(duplicates(arr,n));
	}
	public static ArrayList<Integer> duplicates(int[] arr,int n){
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		Arrays.sort(arr);
	
		
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1]) {
				a.add(arr[i]);
			}
		}
		if(a.isEmpty()) {
			a.add(-1);
		}
		return a;
	}
}
