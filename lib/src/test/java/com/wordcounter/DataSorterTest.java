package com.wordcounter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;



public class DataSorterTest {

  @Test
  public void testSortMapByValue_ValidInputDesc() {
    DataSorter sorter = new DataSorter();
    Map<String, Integer> input = new HashMap<>();
    input.put("bird", 3);
    input.put("is", 1);
    input.put("the", 2);
    input.put("word", 1);

    Map<String, Integer> result = sorter.sortMapByValue(input, "desc");

    Map<String, Integer> expected = new LinkedHashMap<>();
    expected.put("bird", 3);
    expected.put("the", 2);
    expected.put("is", 1);
    expected.put("word", 1);

    assertEquals(expected, result);
  }

   @Test
  public void testSortMapByValue_ValidInputAsc() {
    DataSorter sorter = new DataSorter();
    Map<String, Integer> input = new HashMap<>();
    input.put("bird", 3);
    input.put("is", 1);
    input.put("the", 2);
    input.put("word", 1);

    Map<String, Integer> result = sorter.sortMapByValue(input, "asc");

    Map<String, Integer> expected = new LinkedHashMap<>();
    expected.put("word", 1);
    expected.put("is", 1);
    expected.put("the", 2);
    expected.put("bird", 3);

    assertEquals(expected, result);
  }

}
