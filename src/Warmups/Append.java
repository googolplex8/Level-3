package Warmups;

public class Append {
	public static void main(String[] args) {
		int[] start = new int[] { 1, 3, 7 };
		int[] end = new int[] { 5, 2, 3 };
		new Append().append(start, end);
	}

	int[] append(int[] start, int[] end) {
		int[] appended = new int[start.length + end.length];
		for (int i = 0; i < appended.length; i++) {
			if (i < start.length) {
				appended[i] = start[i];
			} else {
				appended[i] = end[i-start.length];
			}

		}
		for (int i = 0; i < appended.length; i++) {
			System.out.print(appended[i]);
		}
		return appended;
	}
}
