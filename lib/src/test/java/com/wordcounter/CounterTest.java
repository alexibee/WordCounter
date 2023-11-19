package com.wordcounter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class CounterTest {
	@Test
	public void testCountUnique_CaseSensitive() {
		Counter counter = new Counter();
		List<String> input = Arrays.asList("bird", "is", "the", "word", "Bird", "BIRD", "the");
		List<StringCount> result = counter.countUnique(input, true);

    List<StringCount> expected = new ArrayList<>();
    expected.add(new StringCount("the", 2));
    expected.add(new StringCount("Bird", 1));
    expected.add(new StringCount("BIRD",1));
    expected.add(new StringCount("bird",1));
    expected.add(new StringCount("is",1));
    expected.add(new StringCount("word", 1));

    for (int i = 0; i < expected.size(); i++) {
      assertEquals(expected.get(i).getName(), result.get(i).getName());
      assertEquals(expected.get(i).getCount(), result.get(i).getCount());
    }
	}

  @Test
  public void testCountUnique_CaseInsensitive() {
    Counter counter = new Counter();
    List<String> input = Arrays.asList("bird", "is", "the", "word", "Bird", "BIRD", "the");
    List<StringCount> result = counter.countUnique(input, false);

    List<StringCount> expected = new ArrayList<>();
    expected.add(new StringCount("the",2));
    expected.add(new StringCount("bird",3));
    expected.add(new StringCount("is",1));
    expected.add(new StringCount("word", 1));

    for (int i = 0; i < expected.size(); i++) {
      assertEquals(expected.get(i).getName(), result.get(i).getName());
      assertEquals(expected.get(i).getCount(), result.get(i).getCount());
    }
  }

  @Test
  public void testCountUnique_EmptyList() {
    Counter counter = new Counter();

    List<String> input = Arrays.asList();
    List<StringCount> result = counter.countUnique(input, false);

    List<StringCount> expected = new ArrayList<>();
    assertEquals(expected, result);
  }

  @Test
  public void testCountUnique_NullList() {
    Counter counter = new Counter();

    List<StringCount> result = counter.countUnique(null, true);

    List<StringCount> expected = new ArrayList<>();
    assertEquals(expected, result);
  }
}
