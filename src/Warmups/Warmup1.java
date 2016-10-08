package Warmups;

public class Warmup1 {
	public int exclaimCount(String input)
	{
		int numExclamations = 0;
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == ('!')){
				numExclamations+=1;
			}
		}
		return numExclamations;
		
	}
	
	public boolean isPrime(int input){
		boolean isPrime = false;
		for (int i = 2; i < (input+1)/2; i++) {
			if(input%i==0){
				isPrime = false;
				break;
			}
			else{
				isPrime=true;
			}
		}
		return isPrime;
	}
}