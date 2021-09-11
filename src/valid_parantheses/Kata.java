package valid_parantheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class Kata {

	public static void main(String[] args) {
		System.out.println(validParentheses("v(:Q[D+Da)4"));
		System.out.println(validParentheses(")(()))"));
		System.out.println(validParentheses("("));
		System.out.println(validParentheses("(())((()())())"));
		System.out.println(validParentheses("wugwbguegb"));

	}
	
	public static boolean validParentheses(String parens) {
		Deque<Character> stack = new ArrayDeque<Character>();
		
		for(char c : parens.toCharArray()) {
			if(c != '(' && c != ')') {
				continue;
			}
			if(c == '(') {
				stack.push(c);
				continue;
			}			
		    // the first bracket must be open, thus stack cannot be empty at this point
			 if(stack.isEmpty()) {
				return false;
			 }
			
			char check;
			if(c == ')') {
				check = stack.pop();
				if(check != '(') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
