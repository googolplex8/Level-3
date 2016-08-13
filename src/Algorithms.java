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
	
	
	static Double findTallest(List<Double> peeps){
		Double tallest = 0.0;
		for (Double x: peeps){
			if(x>tallest){
				tallest =x;
			}
		}
		return tallest;
	}
	static String findLongestWord(List<String> words){
		int longest = 0;
		String longestWord = "";
		for(String x : words){
			if(x.length()>longest){
				longestWord = x;
				longest=x.length();
			}
		}
		return longestWord;
	}
	static Boolean containsSOS(List<String> message){
		Boolean containsSOS = false;
		for(String x: message){
			if(x.contains("... --- ...")){
			containsSOS = true;
			}
		}
		return containsSOS;
	}
}
