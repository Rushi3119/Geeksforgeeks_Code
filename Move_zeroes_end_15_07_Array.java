package GFG_CODES_Array;

import java.util.ArrayList;
import java.util.List;
//not submitted
//Move all the zeroes at end of the array
public class Move_zeroes_end_15_07_Array {

	public static void main(String[] args) {
		
		int[] arr= {1,4,0,2,0,6,8};
		int n=7;
		Move_zeroes_end_15_07_Array m=new Move_zeroes_end_15_07_Array();
		m.pushzeroes(arr, n);
		
		 for (int i : arr) {
	            System.out.print(i + " ");
	        }
	}
	public void pushzeroes(int[] arr,int n) {
		
//		ArrayList<Integer> a=new ArrayList<>();
//		
//		for(int i:arr) {
//			if(i!=0) {
//				a.add(i);
//			}
//		}
//		for(int j:arr) {
//			if(j==0) {
//				a.add(j);
//			}
//		}
//		System.out.println(a);
//	
		
		
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr[count]=arr[i];
				count++;
				
			}
		}
		for(int i=count;i<n;i++) {
			arr[i]=0;
		}
	}
		
		
}
