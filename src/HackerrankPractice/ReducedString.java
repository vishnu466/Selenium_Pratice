package HackerrankPractice;

import java.util.*;
public class ReducedString {
	public static String superReducedString(String s) {
//			Stack<Character> stack = new Stack<>();
//			
//			for(char c : s.toCharArray()) {
//				if(!stack.isEmpty() && stack.peek()==c)
//					stack.pop();
//				else
//					stack.push(c);
//			}
//			StringBuilder res = new StringBuilder();
//			for(char c:stack) {
//				res.append(c);
//			
//		StringBuilder res = new StringBuilder();
//		for(int i=0;i<s.length();i++) {
//			char c = s.charAt(i);
//			if(res.length()==0 || res.charAt(res.length()-1)!=c) {
//				res.append(c);
//			}
//			else {
//				res.deleteCharAt(res.length()-1);
//			}
//		}
		StringBuilder res = new StringBuilder(s);
		boolean empty = true;
		while(empty){
			empty = false;
			int i=0;
			while(i<res.length()-1) {
				if(res.charAt(i)==res.charAt(i+1)) {
					res.delete(i,i+2);
					empty=true;
				}
				else {
					i++;
				}
			}
		}
       	return res.length()==0 ? "Empty String" : res.toString();			
		
        }
	
	public static void main(String[] args) {
		String str = "aaabccddd";
		System.out.println(superReducedString(str));

	}

}
