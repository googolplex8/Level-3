import java.util.ArrayList;
import java.util.HashMap;

public class AnimalHipster {
	public static void main(String[] args) {

	}

	ArrayList<String> findAnimalHipsters(HashMap<String, ArrayList<String>> network, HashMap<String, String> favoriteAnimals) {
		ArrayList<String> AnimalHipster = new ArrayList<>();
		ArrayList<String> Animals = new ArrayList<>();
		ArrayList<String> Friends = new ArrayList<>();

		for (String curPerson : network.keySet()) {
			Friends = network.get(curPerson);
			Animals.clear();
			// System.out.println(Friends);
			for (String name : Friends) {
				Animals.add(favoriteAnimals.get(name));
				// System.out.println(Animals);

			}
			if (!Animals.contains(favoriteAnimals.get(curPerson))) {
				AnimalHipster.add(curPerson);
				System.out.println(AnimalHipster);
			}
		}
		return AnimalHipster;

	}
}