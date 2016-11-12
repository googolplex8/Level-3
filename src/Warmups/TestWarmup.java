package Warmups;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestWarmup {
	Warmup thing = new Warmup();

	@Test
	public void testRegularCase() {
		assertEquals(3, thing.exclaimCount("hello!!!"));
		assertEquals(2, thing.exclaimCount("good!bye!"));
	}

	@Test
	public void testNoExclamation() {
		assertEquals(0, thing.exclaimCount(""));
		assertEquals(0, thing.exclaimCount("hello"));
	}

	@Test
	public void testPrimeNumber() {
		assertTrue(thing.isPrime(17));
		assertTrue(thing.isPrime(193));
	}

	@Test
	public void testNotPrime() {
		assertFalse(thing.isPrime(9));
		assertFalse(thing.isPrime(100));
	}

	@Test
	public void testMaxFill() {
		int[] expected1 = { 1, 2, 3 };
		int[] actual1 = { 3, 3, 3 };
		int[] expected2 = { 11, 5, 9 };
		int[] actual2 = { 11, 11, 11 };
		int[] expected3 = { 2, 11, 3 };
		int[] actual3 = { 11, 11, 11 };
		assertArrayEquals(thing.maxFill(expected1), actual1);
		assertArrayEquals(thing.maxFill(expected2), actual2);
		assertArrayEquals(thing.maxFill(expected3), actual3);
	}

	@Test
	public void testMixString() {
		assertEquals(thing.mixString("abc", "xyz"), "axbycz");
		assertEquals(thing.mixString("Hi", "There"), "HTihere");
		assertEquals(thing.mixString("xxxx", "There"), "xTxhxexre");
		assertEquals(thing.mixString("", "PCs are better than Macs"), "PCs are better than Macs");
	}

	@Test
	public void testMulByLargest1() {
		int[] input1 = { 0, 1, 2, 3 };
		int[] result1 = { 0, 3, 6, 9 };
		assertArrayEquals(thing.mulByLargest1(input1), result1);
	}
	
	@Test
	public void testMulByLargest2(){
		ArrayList <Integer> input2 = new ArrayList<Integer>();
		for (int i = 0; i < 4; i++) {
			input2.add(i);	
		}
		ArrayList<Integer> result2 = new ArrayList<Integer>();
		result2.add(0);
		result2.add(3);
		result2.add(6);
		result2.add(9);		
		assertEquals(thing.mulByLargest2(input2), result2);
	}
	@Test
	public void testMode(){
		ArrayList <Integer> input1 = new ArrayList<Integer>();
		input1.add(1);
		input1.add(2);
		input1.add(6);
		input1.add(3);
		input1.add(3);
		assertEquals(3, thing.mode(input1));
		ArrayList <Integer> input2 = new ArrayList<Integer>();
		assertEquals(thing.mode(input2), -1);	
		ArrayList <Integer> input3 = new ArrayList<Integer>();
		input3.add(2);
		input3.add(3);
		assertEquals(thing.mode(input3), 2);
	}
	@Test
	public void testPartition(){
		ArrayList <Integer> input1 = new ArrayList<Integer>();
		input1.add(1);
		input1.add(2);
		input1.add(6);
		input1.add(3);
		input1.add(3);
		ArrayList <Integer> expect1 = new ArrayList<Integer>();
		expect1.add(6);
		assertEquals(thing.partition(input1), expect1);
		ArrayList <Integer> input2 = new ArrayList<Integer>();
		assertEquals(thing.partition(input2), input2);	
		ArrayList <Integer> input3 = new ArrayList<Integer>();
		input3.add(2);
		input3.add(3);
		ArrayList <Integer> expect3 = new ArrayList<Integer>();
		expect3.add(3);
		assertEquals(thing.partition(input3), expect3);
	}
	@Test
	public void testListSearch(){
		ArrayList <String> a1 = new ArrayList<String>();
		a1.add("sheep");
		a1.add("sheep");
		a1.add("ox");
		a1.add("goat");
		a1.add("deer");
		ArrayList <String> a2 = new ArrayList<String>();
		a2.add("cat"); 	a2.add("dog"); 	a2.add("fish");
		assertTrue(thing.hasRepeatedWord(a1));
		assertFalse(thing.hasRepeatedWord(a2));
		
		assertEquals(4, thing.getUniqueWords(a1));
		assertEquals(3, thing.getUniqueWords(a2));
		
	}
}
