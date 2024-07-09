package GFG_CODES_Array;

import java.util.ArrayList;

public class Array_duplicates_09_07_Array_Collection {

	public static void main(String[] args) {
		
		//int[] arr= {2,3,1,2,3};
		int[] arr= {0,3,1,2};
		ArrayList<Integer> result=duplicates( arr);
		System.out.println(result);
	}
	public static ArrayList<Integer> duplicates(int[] arr){
		
		ArrayList<Integer> a=new ArrayList<>();
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					a.add(arr[i]);
				}
				
			}
		}
		if(a.isEmpty()) {
			a.add(-1);
		}
		
		return a;
	}
}
