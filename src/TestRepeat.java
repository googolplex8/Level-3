import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestRepeat {
	RepeatWithString repeater = new RepeatWithString();
public static void main(String[] args) {
	new TestRepeat().testRepeatWithString();
}
@Test
public void testRepeatWithString(){
	String s1 = "AxAxA";
	String s2 = "BB!!!BB!!!BB!!!BB";
	String s3 = "Word";
	
	assertEquals(s1, repeater.repeatWithString("A", "x", 3));
	assertEquals(s2, repeater.repeatWithString("BB", "!!!", 4));
	assertEquals(s3, repeater.repeatWithString("Word", "5", 1));


}
@Test
public void testHasRepeatingChar(){
	String s1 = "turtle";
	String s2 = "name";
	String s3 = "ladder";
	String s4 = "computer";
	
	assertTrue(repeater.hasRepeatingChar(s1));
	assertFalse(repeater.hasRepeatingChar(s2));
	assertTrue(repeater.hasRepeatingChar(s3));
	assertFalse(repeater.hasRepeatingChar(s4));
	
}
}
