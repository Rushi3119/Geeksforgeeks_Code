package GFG_CODES_Array;

public class Missing_Number_25_06_Array {

	public static void main(String[] args) {
		
		int[] arr= {1,2,4,5};
		int n=5;
		int result=missingnum(arr, n);
		System.out.println(result);
	}
	public static int missingnum(int[] arr,int n) {
		
		int total=n*(n+1)/2;
		int sum=0;
		
		for(int num: arr) {
			sum=sum+num;
		}
		return total-sum;
	}
}
