package test;

import java.util.Stack;

public class ParenthesesDiv2Easy {

	public static void main(String[] args) {
		ParenthesesDiv2Easy de = new ParenthesesDiv2Easy();
		int depth = de.getDepth("()(((2aB)()))");
		System.out.println(depth);
	}



	public int getDepth(String paranthesis) {
		int depth =0;
		String str="";
		String validString = formatString(paranthesis);
		if (validString.length()==0) {
			return depth;
		}else if (validString.contains("()")) {
			str = validString.replace("()", "");
			depth++;
			depth = depth+getDepth(str);	
		} 
		return depth;
		
	}
	
	
	private String formatString(String str) {
		String pattern= "[a-zA-Z0-9]*";
		String formatedString = str.replaceAll(pattern, "");
		return formatedString;
	}

}
