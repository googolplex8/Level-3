import java.util.HashMap;

public class hashMappyCharCount {
	HashMap hashmap = new HashMap();
public static void main(String[] args) {
	hashMappyCharCount thing = new hashMappyCharCount();
	System.out.println(thing.charCount("hellol", 'l'));
}
	
public int charCount(String input, char check){
	int count = 0;

	for (int i = 0; i < input.length(); i++) {
		if(hashmap.containsKey(input.charAt(i))){
			count=(int) hashmap.get(input.charAt(i));
			hashmap.put(input.charAt(i), count+=1);
		}
		else{
			hashmap.put(input.charAt(i), 1);
		}
	}
	return (int) hashmap.get(check);
	}
}
