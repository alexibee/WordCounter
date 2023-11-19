package com.wordcounter;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class WordCountSorterTest {

  @Test
  public void testReverseSortStringCountsByCountThenName_ValidList() {
    WordCountSorter wordCountSorter = new WordCountSorter();
    StringCount stringCount1 = new StringCount("the", 2);
    StringCount stringCount2 = new StringCount("bird", 6);
    StringCount stringCount3 = new StringCount("is", 3);
    StringCount stringCount4 = new StringCount("word", 2);
    StringCount stringCount5 = new StringCount("surfing", 2);

    List<StringCount> wordCounts = new ArrayList<>();
    wordCounts.add(stringCount1);
    wordCounts.add(stringCount2);
    wordCounts.add(stringCount3);
    wordCounts.add(stringCount4);
    wordCounts.add(stringCount5);
    List<StringCount> expected = new ArrayList<>();

    expected.add(stringCount2);
    expected.add(stringCount3);
    expected.add(stringCount5);
    expected.add(stringCount1);
    expected.add(stringCount4);

    List<StringCount> result = wordCountSorter.sortStringCountsByCountDescThenName(wordCounts);

    for (int i = 0; i < expected.size(); i++) {
      assertEquals(expected.get(i).getName(), result.get(i).getName());
      assertEquals(expected.get(i).getCount(), result.get(i).getCount());
    }
  }

  @Test
  public void testReverseSortStringCountsByCountThenName_EmptyList() {
    WordCountSorter wordCountSorter = new WordCountSorter();

    List<StringCount> wordCounts = new ArrayList<>();

    List<StringCount> expected = new ArrayList<>();

    List<StringCount> result = wordCountSorter.sortStringCountsByCountDescThenName(wordCounts);

    assertEquals(expected, result);
  }

  @Test
  public void testReverseSortStringCountsByCountThenName_Null() {
    WordCountSorter wordCountSorter = new WordCountSorter();

    List<StringCount> expected = new ArrayList<>();


    List<StringCount> result = wordCountSorter.sortStringCountsByCountDescThenName(null);

    assertEquals(expected, result);
  }
}
