import java.util.Scanner;

public class Hangman {
	public String word = "apple";
	char[] charWord = word.toCharArray();
	char[] blanks = new char[word.length()];

	public static void main(String[] args) {
		Hangman hangman = new Hangman();
		hangman.game();
	}

	public void game() {
		for (int i = 0; i < word.length(); i++) {
			blanks[i] = '_';
		}
		Scanner s = new Scanner(System.in);
		boolean finished = false;
		int lives = 9;

		System.out.println("Welcome to Hangman!");
		for (int i = 0; i < word.length(); i++) {
			System.out.print("_ ");
		}
		System.out.println("Lives: " + lives);
		System.out.println("Please enter a letter");

		while (!finished) {
			String val = s.next();
			if (word.contains(val)) {
				generate(val);
			}

		}
	}

	public char[] generate(String input) {
		// System.out.println("generating");

		for (int i = 0; i < charWord.length; i++) {
			if (charWord[i] == input.charAt(0)) {
				blanks[i] = input.charAt(0);
			}

		}
		for (char x : blanks) {
			System.out.print(x + " ");
		}
		System.out.println();
		return blanks;
	}
}
