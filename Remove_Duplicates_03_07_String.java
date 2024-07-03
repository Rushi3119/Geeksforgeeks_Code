package GFG_CODES_STRING;


import java.util.LinkedHashSet;
import java.util.Set;
//LinkedhashSet is used to delete or add the element in an order i
public class Remove_Duplicates_03_07_String {

	public static void main(String[] args) {
		
		String S="russhikeess";
		
		Remove_Duplicates_03_07_String a=new Remove_Duplicates_03_07_String();
		String result=a.removedub(S);
		System.out.println(result);
	}
	
	public String removedub(String S) {
		
		String s1="";
		Set<Character> a=new LinkedHashSet<>();
		
		for(int i=0;i<S.length();i++) {
			if(!a.contains(S.charAt(i))) {
				a.add(S.charAt(i));
				s1=s1+S.charAt(i);
			}
		}
		return s1;
		
	}
}
