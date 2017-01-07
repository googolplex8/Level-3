package Warmups;

import java.util.HashMap;

public class EliminateDups {
public static void main(String[] args) {
	char[] test = new char[]{'a', 'b', 'd', 'e', 'a', 'c', 'c', 'c'};
	new EliminateDups().removeDuplicate(test);
	}
public char[] removeDuplicate(char[] input){
	char[] output;
	HashMap map = new HashMap();
	for(char x : input){
		if(map.containsKey(x)==false){
			map.put(x, 1);
		}
		else{
			map.put(x, ((Integer)map.get(x))+1);
		}
	}
	output = new char[map.size()];
	int counter = 0;
	for(Object x : map.keySet()){
		output[counter]= (char) x;
		counter++;
	}
	System.out.println(output);
	return output;
	
}
}
