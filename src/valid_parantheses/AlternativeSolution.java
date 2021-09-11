package valid_parantheses;

public class AlternativeSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validParentheses("v(:Q[D+Da)4"));
		System.out.println(validParentheses(")(()))"));
		System.out.println(validParentheses("("));
		System.out.println(validParentheses("(())((()())())"));
		System.out.println(validParentheses("wugwbguegb"));
	}
	
	public static boolean validParentheses(String parens) {
		int count = 0;
		for(int i = 0; i < parens.length(); i++) {
			if(parens.charAt(i) == '(') {
				count++;
			}
			if(parens.charAt(i) == ')') {
				count--;
			}
			// first bracket cannot be a closing one
			if(count < 0) {
				return false;
			}
		}
		if(count == 0) {
			return true;
		}
		return false;
	}

}
