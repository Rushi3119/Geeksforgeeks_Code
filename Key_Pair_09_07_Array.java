package GFG_CODES_Array;

public class Key_Pair_09_07_Array {

	public static void main(String[] args) {
		
		int x=11;
		//int arr[]= {1,4,45,6,10,8};
		int arr[]= {1,2,4,3,6};
		
		Key_Pair_09_07_Array m=new Key_Pair_09_07_Array();
		boolean b=m.hasarraytwo(arr, x);
		System.out.println(b);
	}
	public boolean hasarraytwo(int arr[],int x) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==x) {
					return true;
				}
			}
		}
		return false;
	}
}
