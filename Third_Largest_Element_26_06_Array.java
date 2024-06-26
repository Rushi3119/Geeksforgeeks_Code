package GFG_CODES_Array;
//return third largest element in java
//if there are only 0,1,2 elements in array then return -1.

import java.util.Arrays;

public class Third_Largest_Element_26_06_Array {

	public static void main(String[] args) {
		
		int[] a= {2,4,1,3,5};
		int n=5;
		
		Third_Largest_Element_26_06_Array b=new Third_Largest_Element_26_06_Array();
		int result=b.thirdLargest(a, n);
		System.out.println(result);
		
	}
	 int thirdLargest(int a[], int n)
	    {
		    Arrays.sort(a);
		    
		    for(int i=n-1;i>=0;i--){
		        if(a[i]!=a[i-2]){
		            return a[i-2];
		        }
		    }
		    return -1;
	    }
}
