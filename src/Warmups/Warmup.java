package Warmups;

import java.util.ArrayList;
import java.util.HashMap;

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

	public ArrayList<Integer> mulByLargest2(ArrayList<Integer> input) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int largest = input.get(0);
		for (int x : input) {
			if (x > largest) {
				largest = x;
			}
		}
		for (int i = 0; i < input.size(); i++) {
			answer.add(input.get(i) * 3);
		}

		return answer;

	}

	public int mode(ArrayList<Integer> numbers) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int most = 0;
		int mode = -1;
		for (int x : numbers) {
			if (map.containsKey(x)) {
				map.put(x, map.get(x) + 1);
			} else {
				map.put(x, 1);
			}
		}
		for (int y : map.keySet()) {
			if (map.get(y) > most) {
				most = map.get(y);
				mode = y;
			}
		}
		return mode;
	}

	public ArrayList<Integer> partition(ArrayList<Integer> numbers) {
		ArrayList<Integer> higher = new ArrayList<Integer>();
		double sum = 0;
		int num = 0;
		for (int x : numbers) {
			sum += x;
			num += 1;
		}
		for (int x : numbers) {
			if (x > sum / num) {
				higher.add(x);
			}
		}
		return higher;

	}

	public boolean hasRepeatedWord(ArrayList<String> input) {
		HashMap map = new HashMap();
		boolean isTrue = false;
		for (String x : input) {
			if (map.containsKey(x)) {
				map.put(x, (int) map.get(x) + 1);
			} else {
				map.put(x, 1);
			}
		}
		for (Object x : map.keySet()) {
			if ((int) map.get(x) > 1) {
				isTrue = true;
			}
		}
		return isTrue;
	}

	public int getUniqueWords(ArrayList<String> input) {
		int numUnique = 0;
		HashMap map = new HashMap();
		for (String x : input) {
			if (map.containsKey(x)) {
				map.put(x, (int) map.get(x) + 1);
			} else {
				map.put(x, 1);
			}
		}
		numUnique = map.size();
		return numUnique;
	}
}
