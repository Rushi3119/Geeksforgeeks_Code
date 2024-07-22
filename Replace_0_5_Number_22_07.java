package GFG_CODES_arithmetic;
//replacing the 0's with 5
public class Replace_0_5_Number_22_07 {

	public static void main(String[] args) {
		
		int num=1003;
		Replace_0_5_Number_22_07 m=new Replace_0_5_Number_22_07();
		int result=m.convertfive(num);
		System.out.println(result);
	}
	public int convertfive(int num) {
		String s=Integer.toString(num);
		
		s=s.replace("0", "5");
		
		int ans=Integer.valueOf(s);
		
		return ans;
	}
}
