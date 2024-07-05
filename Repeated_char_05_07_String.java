package GFG_CODES_STRING;

public class Repeated_char_05_07_String {

	public static void main(String[] args) {
		
		String S="geeksforgeeks";
		
		Repeated_char_05_07_String m=new Repeated_char_05_07_String();
		char s=m.repeated(S);
		System.out.println(s);
	}
	
	public char repeated(String S) {
		
		char[] c=S.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			
			for(int j=i+1;j<c.length;j++) {
				
				if(c[i]==c[j]) {
					return c[i];
				}
			}
		}
		return '#';
	}
}
