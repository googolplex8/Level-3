package FinalTest;
import java.util.HashMap;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int numInCommon = 0;
		for(String x : hashmap1.keySet()){
			for(String y : hashmap2.keySet()){
				if(x.equals(y)){
					for(String a : hashmap1.values()){
						for(String b : hashmap2.values()){
							if(a.equals(b)){
								numInCommon+=1;
							}
						}
					}
				}
			}
		}
		
		return numInCommon;
	}

}
