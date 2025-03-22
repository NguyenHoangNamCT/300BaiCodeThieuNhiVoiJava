package code300BaiThieuNhi;

import java.util.Stack;

public class ValidParentheses_DauNgoacHopLe {

	public static void main(String[] args) {
		String input1 = "()",
				input2 = "()[]{}",
				input3 = "(]",
				input4 = "([])";
		
		System.out.println("Ket qua: " + input1 + " = " + isValid(input1));
		System.out.println("Ket qua: " + input2 + " = " + isValid(input2));
		System.out.println("Ket qua: " + input3 + " = " + isValid(input3));
		System.out.println("Ket qua: " + input4 + " = " + isValid(input4));
	}
	
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
        	if(checkNgoacMo(s.charAt(i))) {
        		stack.push(s.charAt(i));
        	}
        	else {
        		if(stack.empty())
        			return false;
        		if(!checkNgoacHopLe(stack.pop() , s.charAt(i)))
        			return false;
        	}
        }
        return true;
    }
	
	public static boolean checkNgoacMo(char s) {
		if(s == '(' || s == '{' || s == '[')
			return true;
		return false;
	}
	
	public static boolean checkNgoacHopLe(char s1, char s2) {
		if(
				(s1 == '(' && s2 != ')')
				|| (s1 == '{' && s2 != '}')
				|| (s1 == '[' && s2 != ']')
		  )
			return false;
		return true;
	}
}
