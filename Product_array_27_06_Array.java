package GFG_CODES_Array;

public class Product_array_27_06_Array {

	public static void main(String[] args) {
		
		long[] arr= {1,2,3,4,5};
		int n=5;
		int mod=10004;
		
//		int product=1;
//		for(int num:arr) {
//			product=product*num;
//		
//		}
//		System.out.println(product);
		
		System.out.println(productof(arr, mod, n));
	}
	public static long productof(long[] arr,int  mod,int n) { 
		
		long product=1;
		
		for(int i=0;i<n;i++) {
			product=(product*arr[i])%mod;
		}
		
		return product;
	}
		
	
}
