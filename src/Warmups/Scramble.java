package Warmups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Stack;

public class Scramble {
public static void main(String[] args) {
	new Scramble().scramble("hi");
}
public String scramble (String input){
	String answer = "";
	char[] chars = new char[input.length()];
	chars = input.toCharArray();
	ArrayList <Character> list = new ArrayList<Character>();
	for (int i = 0; i < chars.length; i++) {
		list.add(chars[i]);
	}
	//System.out.println(list);
	
	Random rand = new Random();
	for (int i = 0; i < input.length(); i++) {
		int r = rand.nextInt(list.size());
		answer+=list.get(r);
		list.remove(r);
		
	}
	if(answer.equals(input)){
		scramble(answer);
	}
	else{
	System.out.println(answer);
	}
	return answer;
}
}
