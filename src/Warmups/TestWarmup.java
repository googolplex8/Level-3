package Warmups;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWarmup {
Warmup thing = new Warmup();

@Test
public void testRegularCase(){
	assertEquals(3, thing.exclaimCount("hello!!!"));
	assertEquals(2, thing.exclaimCount("good!bye!"));
}

@Test
public void testNoExclamation(){
	assertEquals(0, thing.exclaimCount(""));
	assertEquals(0, thing.exclaimCount("hello"));
}

@Test
public void testPrimeNumber(){
	assertTrue(thing.isPrime(17));
	assertTrue(thing.isPrime(193));
}

@Test
public void testNotPrime(){
	assertFalse(thing.isPrime(9));
	assertFalse(thing.isPrime(100));
}

@Test
public void testMaxFill() {
    int[] expected1 = {1,2,3};
    int[] actual1 = {3,3,3};
    int[] expected2 = {11,5,9};
    int[] actual2 = {11,11,11};
    int[] expected3 = {2,11,3};
    int[] actual3 = {11,11,11};
    assertArrayEquals(thing.maxFill(expected1), actual1);
    assertArrayEquals(thing.maxFill(expected2), actual2);
    assertArrayEquals(thing.maxFill(expected3), actual3);
}

@Test
public void testMixString() {
    assertEquals(thing.mixString("abc", "xyz"), "axbycz");
    assertEquals(thing.mixString("Hi", "There"), "HTihere");
    assertEquals(thing.mixString("xxxx", "There"), "xTxhxexre");
    assertEquals(thing.mixString("" , "PCs are better than Macs"), "PCs are better than Macs");
}

}
