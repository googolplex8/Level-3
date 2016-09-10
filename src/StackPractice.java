import java.util.Stack;

public class StackPractice {
	Stack<StackPractice> myStack = new Stack<StackPractice>();

	int x = 0;

	public StackPractice(int x) {
		this.x = x;
		
		while (true) {
			StackPractice Eli = new StackPractice(0);
			myStack.push(Eli);
		}
	}

	public static void main(String[] args) {
		new StackPractice(1);
	}
}
