package GFG_CODES_Array;
//array contains 0 or 1 atleast one time 
//how many times first element is there we have to count
public class Index_1starray_27_06_Array {

	public static void main(String[] args) {
		
		long[] arr= {0,0,0,0,0,0,1,1,1};
		int n=9;
		
		Index_1starray_27_06_Array a=new Index_1starray_27_06_Array();
		
		long result=a.firstele(arr, n);
		System.out.println(result);
	}
	
	public long firstele(long[] arr,int n) {
	
		int count=0;
		int count2=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				count++;
					
			}
			if(arr[i]==1) {
				count2++;
			}
		}
		if(count2==0) {
			return -1;
		}
	return count;
	}
	
}