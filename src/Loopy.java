
public class Loopy {
	int total = 0;
public static void main(String[] args) {
	new Loopy().suminator(45);
}
public int suminator(int num){
	
	if(num>=1){
	total += num%10;
	suminator(num/10);
	}

	System.out.println(total);
	return total;
	
}
}
