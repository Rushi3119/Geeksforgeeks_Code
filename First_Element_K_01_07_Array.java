package GFG_CODES_Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class First_Element_K_01_07_Array {

	public static void main(String[] args) {
		
		int[] arr= {1,7,5,5,3,4,8,7};
		int n=7;
		int k=2;
		First_Element_K_01_07_Array b=new First_Element_K_01_07_Array();
		int result=b.firstelement(arr, n, k);
		System.out.println(result);
	}
	public int firstelement(int[] arr,int n,int k) {

		Map<Integer, Integer> m = new HashMap<>();
		for(int x:arr)
		{
			if(m.containsKey(x))
			{
				m.put(x,m.get(x)+1);
			}
			else
			{
				m.put(x, 1);
			}
			
			if(m.containsValue(k))
			{
				return x;
			}
		}
		return -1;
		
		
		//		int count=1;
//		int m=0;
//		for(int i=0;i<n;i++) {
//			
//			for(int j=i+1;j<n;j++) {
//				if(arr[i]==arr[j]) {
//					count++;
//				}
//				 if(count==k) {
//					m=arr[i];
//				 }
//			}
//		}
//		 
//		if(count!=k) {
//		m=-1;
//		}
		
		
	}
}
