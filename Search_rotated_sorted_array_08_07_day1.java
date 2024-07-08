package GFG_CODES_Daily_Streak;

public class Search_rotated_sorted_array_08_07_day1 {

	public static void main(String[] args) {
		
		int[] arr= {10,20,30,40,50};
		int key=50;
		Search_rotated_sorted_array_08_07_day1 m=new Search_rotated_sorted_array_08_07_day1();
		int result=m.search(arr, key);
		System.out.println(result);
	}
	public int search(int[] arr,int key) {
	
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
}
