package Warmups;

public class Review {
	public static void main(String[] args) {
		int[] nums = { 20, 3, 7, 8, 5, 10 };
		String one = "turkey";
		String two = "urkey";
		//new Review().sumMinAndMax(nums);
		new Review().charsInBothWords(two , one);
	}

	public int sumMinAndMax(int[] x) {
		int sum = 0;
		int min = x[0];
		int max = x[0];
		for (int y : x) {
			if (y > max) {

				max = y;
			} else if (y < min) {

				min = y;
			}
		}
		sum = min + max;
		System.out.println(sum);
		return sum;
	}
	public char[] charsInBothWords(String x, String y){
		char[] first = x.toCharArray();
		char[] second = y.toCharArray();
		char[] answer = new char[x.length()];
		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < second.length; j++) {
				if (first[i] == second[j]) {
					answer[i]=second[j];
				}
			}
		}
		System.out.println(answer);
		return answer;
	}
}
