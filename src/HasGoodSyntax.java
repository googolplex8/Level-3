import java.util.Stack;

public class HasGoodSyntax {
	public static void main(String[] args) {
		HasGoodSyntax h = new HasGoodSyntax();
	}

	public boolean hasGoodSyntax(String input) {
		boolean hasGoodSyntax = false;
		Stack stack = new Stack();
		char[] chars = input.toCharArray();
		for (int i = 0; i < chars.length; i++) {
//			if (chars[i]==('(') {
//				
//			}
			stack.push(chars[i]);
		}
		
		return hasGoodSyntax;
	}
}
