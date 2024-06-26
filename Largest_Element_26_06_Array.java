package GFG_CODES_Array;

import java.util.Arrays;

public class Largest_Element_26_06_Array {

	public static void main(String[] args) {
		
		int[] arr= {1,3,5,56,34,89,45};
		int n=7;
	
		Largest_Element_26_06_Array a=new Largest_Element_26_06_Array();
		
		int result=a.largest(arr, n);
		System.out.println(result);
	}
	public int largest(int[] arr,int n) {
		
		Arrays.sort(arr);
		
		return arr[n-1];
	}
}
