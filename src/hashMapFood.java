import java.util.HashMap;

public class hashMapFood {
public static void main(String[] args) {
	HashMap map = new HashMap();
	map.put("Eli", "pasta");
	map.put("Andrew", "quesodilla");
	map.put("Bob", "soup");
	map.put("Olivia", "pizza");
	System.out.println(getFavoriteFood("Bob", map));
	replaceFavoriteFood("Andrew", map, "poop");
	System.out.println(map.get("Andrew"));
	System.out.println(doesAnyoneLike("poop", map));
}
public static String getFavoriteFood(String name, HashMap map){
	 String favFood;
	favFood =  (String) map.get(name);
	 return favFood;
	
}
public static void replaceFavoriteFood(String name, HashMap map, String newFood){
	map.put(name, newFood);
}
public static boolean doesAnyoneLike(String food, HashMap map){
	boolean isLiked = false;
	if(map.containsValue(food)){
		isLiked = true;
	}
	return isLiked;
}
}
