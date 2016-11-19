import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
	public String word;
	char[] charWord;
	char[] blanks;
	int lives = 9;

	public static void main(String[] args) {

		Hangman hangman = new Hangman();
		hangman.game();
	}

	public void game() {

		word = randWord();
		charWord = word.toCharArray();
		blanks = new char[word.length()];
		//System.out.println(word);
		for (int i = 0; i < word.length(); i++) {
			blanks[i] = '_';
		}
		Scanner s = new Scanner(System.in);
		boolean finished = false;

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
			} else {
				lives--;
				System.err.println("You have " + lives + " lives");
				System.out.println();
			}
			if(lives<1){
				System.err.println("You Lose!!!");
				System.out.println();
				System.out.println("The word was: " + word);
				System.exit(0);
			}
			if (Arrays.equals(charWord, blanks)) {
				finished = true;
			}
			if (finished == true) {
				System.out.println("You win!!! You still have " + lives + " lives");
				finished = false;
				System.out.println("Time for another word:");
				word=randWord();
				charWord = word.toCharArray();
				blanks = new char[word.length()];
				//System.out.println(word);
				for (int i = 0; i < word.length(); i++) {
					blanks[i] = '_';
					System.out.print("_ ");
				}
					System.out.println();
					System.out.println("Please enter a letter");
			}
		}

	}

	public String randWord() {
		String RWord = "";
		try {
			Random rand = new Random();
			int num = rand.nextInt(1000);
			BufferedReader br = new BufferedReader(new FileReader("randWords.txt"));
			for (int i = 0; i < num; i++) {
				RWord = br.readLine();
				
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return RWord;
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
		System.out.println("You have " + lives + " lives");
		System.out.println();
		return blanks;
	}
}
