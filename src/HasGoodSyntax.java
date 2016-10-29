import java.util.Stack;

public class HasGoodSyntax {
	public static void main(String[] args) {
		HasGoodSyntax h = new HasGoodSyntax();
		h.hasGoodSyntax("it's dead Jim!");
	}

	public boolean hasGoodSyntax(String input) {
		boolean hasGoodSyntax = true;
		Stack<Character> stack = new Stack();
		char[] chars = input.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == ('(') || chars[i] == ('{') || chars[i] == ('[') || chars[i] == ('<')) {
				stack.push((char) chars[i]);
			}
			if (chars[i] == (')') || chars[i] == ('}') || chars[i] == (']') || chars[i] == ('>')) {
				if (stack.isEmpty()) {
					hasGoodSyntax = false;
					break;
				}
				char last = (char) stack.pop();

				if (last == ('(') && chars[i] == ')') {
					hasGoodSyntax = true;
				} else if (last == ('{') && chars[i] == '}') {
					hasGoodSyntax = true;
				} else if (last == ('[') && chars[i] == ']') {
					hasGoodSyntax = true;
				} else if (last == ('<') && chars[i] == '>') {
					hasGoodSyntax = true;
				} else {
					hasGoodSyntax = false;
				}
			}

		}
		System.out.println(hasGoodSyntax);
		return hasGoodSyntax;
	}
}
