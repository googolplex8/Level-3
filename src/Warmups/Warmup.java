package Warmups;

public class Warmup {
	public int exclaimCount(String input) {
		int numExclamations = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ('!')) {
				numExclamations += 1;
			}
		}
		return numExclamations;

	}

	public boolean isPrime(int input) {
		boolean isPrime = false;
		for (int i = 2; i < (input + 1) / 2; i++) {
			if (input % i == 0) {
				isPrime = false;
				break;
			} else {
				isPrime = true;
			}
		}
		return isPrime;
	}

	public int[] maxFill(int[] input) {
		int biggest = input[0];
		int[] array = new int[input.length];
		for (int x : input) {
			if (x > biggest) {
				biggest = x;
			}
		}
		for (int i = 0; i < input.length; i++) {
			array[i] = biggest;
		}
		return array;
	}

	public String mixString(String input1, String input2) {
		String result = "";
		int length;
		if (input1.length() >= input2.length()) {
			length = input1.length();
		} else {
			length = input2.length();
		}
		for (int i = 0; i < length; i++) {
			if (i <= input1.length()-1) {
				result += input1.substring(i, i + 1);
			}
			if (i <= input2.length()-1) {
				result += input2.substring(i, i + 1);
			}
		}
		System.out.println(result);
		return result;

	}
}