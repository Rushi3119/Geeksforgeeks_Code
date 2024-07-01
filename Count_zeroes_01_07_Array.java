package GFG_CODES_Array;

public class Count_zeroes_01_07_Array {

	public static void main(String[] args) {
		int[] arr= {1,1,1,1,1,0,0,0};
		int n=8;
		
		Count_zeroes_01_07_Array b=new Count_zeroes_01_07_Array();
		
		int result= b.countzeroes(arr, n);
		System.out.println(result);
	}
	
	public int countzeroes(int[] arr,int n) {
		
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0)
			{		
		      count++;		
			}
		}
			return count;
	}
}
	
