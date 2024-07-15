package GFG_CODES_arithmetic;
//count the number of squares which are less than N
public class Count_Squares_15_07 {

 public static void main(String[] args) {
	
	 int N=9;
	 
	 int result=countsquares(N);
	 System.out.println(result);
}
 
  public static int countsquares(int N) {
	 
	  int count=0;
	  for(int i=1;i*i<N;i++) {
		  count++;
	  }
	  return count;
  }
}
