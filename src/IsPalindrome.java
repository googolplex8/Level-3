import java.util.Stack;

public class IsPalindrome {
public static void main(String[] args) {
	IsPalindrome p = new IsPalindrome();
	p.isPanlindrome("sit on a potato pan otis");
}
public boolean isPanlindrome(String input){
	boolean isPalindrome= false;
	char[] word = input.toCharArray();
	String $new = "";
	Stack stack = new Stack();
	for (int i = 0; i < word.length; i++) {
	if(word[i]!=(' ')){
		stack.push(word[i]);
		}
	}
	for (int i = 0; i < $new.length(); i++) {
		$new += stack.pop();
	}
	if (input.equals($new)) {
		isPalindrome=true;
	}
	System.out.println(isPalindrome);
	return isPalindrome;
}
}
