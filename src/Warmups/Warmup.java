package Warmups;

import java.util.ArrayList;

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
			if (i <= input1.length() - 1) {
				result += input1.substring(i, i + 1);
			}
			if (i <= input2.length() - 1) {
				result += input2.substring(i, i + 1);
			}
		}
		System.out.println(result);
		return result;

	}

	public int[] mulByLargest1(int[] input1) {
		int[] answer = new int[input1.length];
		int largest = input1[0];
		for (int x : input1) {
			if (x > largest) {
				largest = x;
			}
		}
		for (int i = 0; i < input1.length; i++) {
			answer[i] = input1[i] * largest;
		}
		return answer;

	}

	public ArrayList<Integer> mulByLargest2(ArrayList <Integer> input) {
		ArrayList <Integer> answer = new ArrayList<Integer>();
		int largest = input.get(0);
		for(int x : input){
			if (x > largest) {
				largest = x;
			}
		}
		for (int i = 0; i < input.size(); i++) {
			answer.add(input.get(i)*3);
		}

		return answer;

	}
}
