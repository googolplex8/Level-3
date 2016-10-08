import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
 
public class Dictionary {
 
    public static void main(String[] args) throws IOException{
        // 1. Initialize hashmap and arraylist
    	HashMap map = new HashMap();
    	ArrayList <String> list  = new ArrayList<>();
    	
        Scanner inFile1 = new Scanner(new File("dictionary.txt")).useDelimiter("\n");
 
        // while loop
        while (inFile1.hasNext()) {
            // find next line
            String current = inFile1.next();
            // 2. Add to both hashmap and arraylist
            map.put(current, null);
            list.add(current);
        }
        inFile1.close();
        long startTime = System.nanoTime();
        // 3. Find the word "turtle" in the arraylist
       list.contains("turtle");
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("The ArrayList takes " + duration + " nanoseconds");
 
        startTime = System.nanoTime();
        // 4. Find the word "turtle" in the hashmap
        map.containsKey("tutle");
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("The HashMap takes " + duration+ " nanoseconds");
    }
}