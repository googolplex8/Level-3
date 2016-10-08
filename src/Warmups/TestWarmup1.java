package Warmups;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWarmup1 {
Warmup1 thing = new Warmup1();

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
}
