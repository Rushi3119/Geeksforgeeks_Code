package GFG_CODES_Array;

public class Count_odd_even_26_06_Array {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		int n=5;
		
		Count_odd_even_26_06_Array b=new Count_odd_even_26_06_Array();
		
		int result[]=b.countoddeven(arr,n);
		
		System.out.print(result[0]);
		System.out.println(result[1]);
	}
	
	public int[] countoddeven(int[] arr,int n) {
		
		int c1=0;
		int c2=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				c1++;
			}
			else {
				c2++;
			}
		}
		return new int[]{c1,c2};
	}
}
