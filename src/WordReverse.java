import java.util.Stack;

public class WordReverse {
public static void main(String[] args) {
	new WordReverse().reverser("hello");
}
public String reverser(String word){
	String reversed = "";
	System.out.println(word);
	int len = word.length();
	Stack <Character> letter = new Stack <Character>();
	for (int i = 0; i < len; i++) {
		letter.push(word.charAt(i));
	}
	int length = letter.size();
	
	//System.out.println(letter);
	for (int i = 0; i < length; i++) {
		reversed = reversed + letter.pop();
	}
	System.out.println(reversed);;
	return reversed;
}
}
