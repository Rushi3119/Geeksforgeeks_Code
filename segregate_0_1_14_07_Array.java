package GFG_CODES_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class segregate_0_1_14_07_Array {

	public static void main(String[] args) {
		
		int[] arr= {0,0,0,1,0};
		segregate_0_1_14_07_Array m=new segregate_0_1_14_07_Array();
		m.am(arr);
		
	}
	
	public void am(int[] arr) {
	
		List<Integer> a=new ArrayList<>();
		
		for(int i:arr) {
			if(i==0) {
				a.add(i);
			}
			
		}
		for(int i2:arr) {
			if(i2==1) {
				a.add(i2);
			}
		}
		System.out.println(a);
		
//		Arrays.sort(arr);
	}
	
}
