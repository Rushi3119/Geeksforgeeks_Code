package GFG_CODES_STRING;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicates_04_07_String {

	public static void main(String[] args) {
		
		String str="geEksforGEeks";
		Remove_Duplicates_04_07_String m=new Remove_Duplicates_04_07_String();
		String result=m.removedup(str);
		System.out.println(result);
	}
	
	public String removedup(String str) {
		String S1="";
		Set<Character> a=new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++) {
			if(!a.contains(str.charAt(i))) {
				a.add(str.charAt(i));
				S1=S1+str.charAt(i);
			}
		}
		return S1;
	}
}
