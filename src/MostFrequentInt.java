import java.util.HashMap;

public class MostFrequentInt {
public static void main(String[] args) {
	MostFrequentInt thing = new MostFrequentInt();
	int[] input = {0,1,1,2,5,3,3,0,0,0,1, 7, 7, 7,9,9,9,9,9,9,9,9,9,9,9,9};
	thing.mostFrequent(input);
}
public int mostFrequent(int[] input){
	int num = 0;
	int freq = -1;
	
	HashMap map = new HashMap();
	for(int x : input){
		if (map.containsKey(x)) {
			map.put(x, (int)map.get(x)+1);
		}
		else{
			map.put(x, 1);
		}
	}
	for(Object key : map.keySet()){
		if ((int)map.get(key)>num) {
			num=(int)map.get(key);
			freq = (int)key;
		}
	}
	System.out.println(freq);
	return freq;
}
}
