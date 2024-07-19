package GFG_CODES_STRING;

public class Last_Index_1_19_07_String {

	public static void main(String[] args) {
		
		String s="00001";
		
		Last_Index_1_19_07_String a=new Last_Index_1_19_07_String();
		int result=a.lastindex(s);
		System.out.println(result);
	}
	public int lastindex(String s) {
		
		char[] c=s.toCharArray();
		
		for(int i=c.length-1;i>=0;i--) {
			if(c[i]=='1') {
				return i;
			}
		}
		return -1;
	}
}
