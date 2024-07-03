package GFG_CODES_STRING;

public class Non_Repeating_Char_02_07_String {

	public static void main(String[] args) {
		
		String S="hello";
		System.out.println(nonrepeat(S));
		
	}
	public static char nonrepeat(String S) {
		
		int[] count=new int[256];
		
		for(int i=0;i<S.length();i++) {
			count[S.charAt(i)]++;
			
		}
		for(int i=0;i<S.length();i++) {
			if(count[S.charAt(i)]==1) {
				return S.charAt(i);
			}
		}
		return '$';
	}
}
