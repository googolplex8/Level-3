import java.util.ArrayList;

public class Products {
public static void main(String[] args) {
	ArrayList <Integer> nums = new ArrayList<>(); 
	nums.add(2);
	nums.add(3);
	nums.add(1);
	nums.add(4);
	nums.add(3);
	nums.add(2);

	Products products = new Products();
	products.products(nums);
}
public void products(ArrayList <Integer> nums){
	int total = 1;
	for(int x : nums){
		total*=x;
	}
	for(int x: nums){
		System.out.println(total/x);
	}
}
}
