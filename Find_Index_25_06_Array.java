package GFG_CODES_Array;

public class Find_Index_25_06_Array {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,5};
		int n=6;
		int key=5;
		
		int[] result=indexes(arr, n, key);
		//System.out.println(result);
		
		System.out.print(result[0]);
		System.out.print(result[1]);
	
	}
	public static int[] indexes(int[] arr,int n,int key) { 
	
		int[] a=new int[2];
		int start=-1;
		int end=-1;
		
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				start=i;
				break;
			}
		}
		for(int i=n-1;i>=0;i--) {
			if(arr[i]==key) {
				end=i;
				break;
			}
		}
		
		a[0]=start;
		a[1]=end;
		
		
		return a;
	}
}
