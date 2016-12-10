package Warmups;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class BrokenPalindrome {
public static void main(String[] args) {
	new BrokenPalindrome().hazeYourself("Andrew, haze yourself");
}
public String hazeYourself(String input){
	String answer = "";
	Stack <Character> stack = new Stack<Character>();
	
	char[] chars = new char[input.length()];
	chars = input.toCharArray();
	if(even(input.length())){
		answer = input.substring(0, input.length()/2);
		for (int i = 0; i < chars.length/2; i++) {
			stack.push(chars[i]);
		}
		for (int i = 0; i < chars.length/2; i++) {
			answer += stack.pop();
		}
		
	}
	else{
		answer = input.substring(0, (input.length()/2)+1);
		for (int i = 0; i < (chars.length/2); i++) {
			stack.push(chars[i]);
		}
		for (int i = 0; i < (chars.length/2); i++) {
			answer += stack.pop();
		}
	}
	System.out.println(answer);
	return answer;
}
public boolean even(int num){
	if(num%2==0){
		return true;
	}
	else{
		return false;
	}
}
}
