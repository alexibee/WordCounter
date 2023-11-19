//package com.wordcounter;
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//
//public class CounterTest {
//	@Test
//	public void testCountUnique_CaseSensitive() {
//		Counter counter = new Counter();
//		List<String> input = Arrays.asList("bird", "is", "the", "word", "Bird", "BIRD", "the");
//		List<StringCount> result = counter.countUnique(input, true);
//
//		Map<String, Integer> expected = new HashMap<>();
//		expected.put("bird", 1);
//		expected.put("is", 1);
//		expected.put("the", 2);
//		expected.put("word", 1);
//		expected.put("Bird", 1);
//		expected.put("BIRD", 1);
//
//		assertEquals(expected, result);
//	}
//
//  @Test
//  public void testCountUnique_CaseInsensitive() {
//    Counter counter = new Counter();
//    List<String> input = Arrays.asList("bird", "is", "the", "word", "Bird", "BIRD", "the");
//    Map<String, Integer> result = counter.countUnique(input, false);
//
//    Map<String, Integer> expected = new HashMap<>();
//    expected.put("bird", 3);
//    expected.put("is", 1);
//    expected.put("the", 2);
//    expected.put("word", 1);
//
//    assertEquals(expected, result);
//  }
//
//  @Test
//  public void testCountUnique_EmptyList() {
//    Counter counter = new Counter();
//
//    List<String> input = Arrays.asList();
//    Map<String, Integer> result = counter.countUnique(input, false);
//
//    Map<String, Integer> expected = new HashMap<>();
//    assertEquals(expected, result);
//  }
//
//  @Test
//  public void testCountUnique_NullList() {
//    Counter counter = new Counter();
//
//    Map<String, Integer> result = counter.countUnique(null, true);
//
//    Map<String, Integer> expected = new HashMap<>();
//    assertEquals(expected, result);
//  }
//}
