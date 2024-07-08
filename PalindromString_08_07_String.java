package GFG_CODES_STRING;

public class PalindromString_08_07_String {

	public static void main(String[] args) {
		
		String S="abba";
		PalindromString_08_07_String m=new PalindromString_08_07_String();
		int result=m.isPalindrom(S);
		System.out.println(result);
		
	}
	public int isPalindrom(String S)
	{		
//		int length = S.length();
//        for (int i = 0; i < length / 2; i++) {
//            if (S.charAt(i) != S.charAt(length - 1 - i)) {
//                return 0; // S is not a palindrome
//            }
		
		StringBuilder sb=new StringBuilder(S);
		String r=sb.reverse().toString();
		
		if(S.equals(r)) {
			return 1;
		}
		return 0;
	}
}
