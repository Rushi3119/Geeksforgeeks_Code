package GFG_CODES_Array;
//check two 
public class Check_Equal_Arrays_12_07_Array {

	public static void main(String[] args) {
		
	
	int[] arr1= {1, 2, 5};
	int[] arr2= {2, 4, 15};
	
	boolean c=check(arr1, arr2);
	System.out.println(c);
	}
	public static boolean check(int[] arr1,int[] arr2) {
		int sum1=0;
		int sum2=0;
		for(int num:arr1) {
			sum1=sum1+num;
			
		}
		for(int num:arr2) {
			sum2=sum2+num;
		}
		if(sum1==sum2) {
			return true;
		}
		return false;
		
}
}