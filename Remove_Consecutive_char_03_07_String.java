package GFG_CODES_STRING;

import java.util.Arrays;

public class Remove_Consecutive_char_03_07_String {

	public static void main(String[] args) {
		
	
		String S="adfgfgffrrttabb";
		Remove_Consecutive_char_03_07_String e=new Remove_Consecutive_char_03_07_String();
		 String res=e.removecons(S);
		 System.out.println(res);
		
	}
	public String removecons(String S) {
		
StringBuilder res=new StringBuilder();
		
		res.append(S.charAt(0));
        
        for(int i=1;i<S.length();i++)
            {
                if(S.charAt(i)!=S.charAt(i-1)){
                    res.append(S.charAt(i));
                }
            }
        
        return res.toString();
		
	}
	
}
