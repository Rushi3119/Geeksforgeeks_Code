package GFG_CODES_Array;

public class Check_array_sorted_28_06_Array {


	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int n=5;
		
		Check_array_sorted_28_06_Array v=new Check_array_sorted_28_06_Array();
		boolean result=v.arraysort(arr, n);
		System.out.println(result);
	}
	public boolean arraysort(int[] arr,int n) {
		
		for(int i=1;i<n;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}
}
