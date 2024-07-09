package GFG_CODES_arithmetic;

public class Square_root_09_07_Arithemetic {

	public static void main(String[] args) {
		long x=25;
		 Square_root_09_07_Arithemetic m=new  Square_root_09_07_Arithemetic();
		
		long a=m.floorsqrt(x);
		System.out.println(a);
	}
	public long floorsqrt(long x) {
		long z=(long) Math.pow(x,0.5);
		
		return z;
	}
}
