import java.util.ArrayList;

public class RepeatWithString {
public String repeatWithString(String s1, String s2, int num){
	String returnValue = "";
	for (int j = 0; j < num-1; j++) {
		returnValue += s1;
		returnValue += s2;
	}
	returnValue+=s1;
	return returnValue;
}
public boolean hasRepeatingChar(String word){
	boolean hasRepeatingChar = false;
	char[] charArray;
	charArray = word.toCharArray();
	ArrayList <Character> seenLetter = new ArrayList <>();
	for(char x: charArray){
		if(seenLetter.contains(x)){
			hasRepeatingChar=true;
		}
		else{
			seenLetter.add(x);
		}
	}
	return hasRepeatingChar;
}
}
