import java.util.ArrayList;
import java.util.Random;

public class Plane {
	static int num = new Random().nextInt(300);
	int numberOfPassengers;
	static ArrayList<Snake> snakes = new ArrayList();

	public Plane(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	static Plane plane = new Plane(num);

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			Snake snake = new Snake(Randomness.randOneToTen(), Randomness.randTrueOrFalse());
			Plane.plane.snakes.add(snake);
		}
		Plane.plane.Probability();
		
	}
	public void Probability(){
	System.out.println("The chance of death is: " + chanceOfDeath(totalVenom(snakes)) + "%");
	}
	
	public static int totalVenom(ArrayList<Snake> snakes) {
		int totalVenom = 0;
		for (Snake x : snakes) {
			if (x.isVenemous() == true) {
				totalVenom += x.getViciousness()+1;
			} else {
				
			}

		}
		System.out.println("The total viciousness of venemous snakes is: " + totalVenom);
		return totalVenom;
		
	}

	public double chanceOfDeath(int totalVenom) {
		System.out.println("Number of passengers: " + plane.getnumberOfPassengers());
		double chanceOfDeath = (totalVenom * 10) / plane.getnumberOfPassengers();
		 if(chanceOfDeath>100){
		chanceOfDeath = 100;
		 }
		return chanceOfDeath;
	}

	int getnumberOfPassengers() {
		return numberOfPassengers;
	}
}
