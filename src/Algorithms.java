import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	static int findBrokenEgg(List<String> eggs) {
		int index = 0;
		for (String x : eggs) {
			if (x.equals("whole")) {
				index += 1;
			} else {
				return index;
			}
		}
		return index;
	}

	static int countPearls(List<Boolean> oysters) {
		int num = 0;
		for (Boolean x : oysters) {
			if (x == true) {
				num++;
			}
		}
		return num;
	}

	static Double findTallest(List<Double> peeps) {
		Double tallest = 0.0;
		for (Double x : peeps) {
			if (x > tallest) {
				tallest = x;
			}
		}
		return tallest;
	}

	static String findLongestWord(List<String> words) {
		int longest = 0;
		String longestWord = "";
		for (String x : words) {
			if (x.length() > longest) {
				longestWord = x;
				longest = x.length();
			}
		}
		return longestWord;
	}

	static Boolean containsSOS(List<String> message) {
		Boolean containsSOS = false;
		for (String x : message) {
			if (x.contains("... --- ...")) {
				containsSOS = true;
			}
		}
		return containsSOS;
	}

	static ArrayList<Double> sortScores(ArrayList<Double> scores) {
		Double prior = scores.get(0);
		int pos = 0;
		boolean change = true;
		while (change == true) {
			change = false;
			pos = 0;
			prior = scores.get(0);
			for (Double x : scores) {
				if (x >= prior) {
					prior = x;
					pos += 1;
				} else if (x < prior) {
					scores.set(pos, prior);
					scores.set(pos - 1, x);
					pos += 1;
					change = true;
				}
			}
		}
		return scores;
	}

	static ArrayList<String> sortDNA(ArrayList<String> unsorted) {
		String prior = "";
		int pos = 0;
		boolean dif = true;
		while (dif == true) {
			dif = false;
			pos = 0;
			prior = "";
			for (String x : unsorted) {
				if (prior.length() < x.length()) {
					prior = x;
					pos += 1;
				} else if (prior.length() > x.length()) {
					unsorted.set(pos, prior);
					unsorted.set(pos - 1, x);
					pos += 1;
					dif = true;
				}
			}
		}
		return unsorted;
	}

	static ArrayList<String> sortWords(ArrayList<String> words) {
		String prior = "";
		int pos = 0;
		boolean out = true;
		while (out == true) {
			prior = "";
			pos = 0;
			out = false;
			for (String x : words) {
				if (String.CASE_INSENSITIVE_ORDER.compare(prior, x) == -1) {
					prior = x;
					pos += 1;
				} else if (String.CASE_INSENSITIVE_ORDER.compare(prior, x) == 1) {
					words.set(pos, prior);
					words.set(pos - 1, x);
					out = true;
				} else {
					prior = x;
					pos += 1;
				}

			}

		}
		return words;
	}
}
