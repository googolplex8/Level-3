import java.util.Random;

public class Randomness {
public static void main(String[] args) {
	
}
public static boolean randTrueOrFalse (){
	boolean b = true;
	int random = new Random().nextInt(2);
	if (random == 1) {
		b = true;
		
	}
	else if(random ==0){
		b = false;
	}
	return b;
}
public static int randOneToTen(){
	int random = new Random().nextInt(10);
	return random;
}
}
