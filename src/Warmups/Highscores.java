package Warmups;

public class Highscores {

	public static void main(String[] args) {
		String[] highscores = initHighscores();
		printHighscores(highscores);
		insertScore(highscores, "Eli Smith:1000");
		insertScore(highscores, "Roy Ahh:1000");
		insertScore(highscores, "Eli Smith:1000");
		System.out.println();

		printHighscores(highscores);
	}

	public static String[] initHighscores() {
		String[] highscores = new String[5];
		highscores[0] = "No-name:0";
		highscores[1] = "No-name:0";
		highscores[2] = "No-name:0";
		highscores[3] = "No-name:0";
		highscores[4] = "No-name:0";
		
		return highscores;
	}

	public static void printHighscores(String[] highscores) {
		for (int i = 0; i < highscores.length; i++) {
			System.out.println(highscores[i]);
		}

	}

	public static String[] insertScore(String[] highscores, String newScore) {
		String[] extra = new String[6];
		for (int i = 0; i < highscores.length; i++) {
			extra[i+1]=highscores[i];
		}
		extra[0] = newScore;
		
		for (int i = 0; i < extra.length-1; i++) {
			String[] split1 = extra[i].split(":");
			String[] split2 = extra[i+1].split(":");
			
			if(Integer.parseInt(split1[1])<=Integer.parseInt(split2[1])){
				String temp = extra[i];
				extra[i] = extra[i+1];
				extra[i+1] = temp;
			}

		}
		for (int i = 0; i < highscores.length; i++) {
			highscores[i] = extra[i];
		}
		
		return highscores;

	}
}
