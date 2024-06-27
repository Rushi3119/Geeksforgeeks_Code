package GFG_CODES_Array;

public class Exceptionally_odd_27_06_array {
public static void main(String[] args) {
 int arr[] = {1, 2, 3, 2, 3, 1, 3};
	
	int x=0;
    for(int i:arr){
        x^=i;
    }
    System.out.println(x);
}	
}