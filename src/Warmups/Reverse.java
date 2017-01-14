package Warmups;

public class Reverse {
public static void main(String[] args) {
	int[] nums = new int[]{3, 7, 5, 2, 1, 9};
	new Reverse().reverse(nums);	
}
public int[] reverse(int[] input){
	for (int i = 0; i < input.length/2; i++) {
		int on = input[i];
		input[i] = input[input.length-i-1];
		input[input.length-i-1] = on;
	}
	for (int i = 0; i < input.length; i++) {
		System.out.println(input[i]);
	}
	
	return input;
	
}
}
