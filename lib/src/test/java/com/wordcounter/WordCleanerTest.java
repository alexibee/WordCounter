package com.wordcounter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class WordCleanerTest {

  @Test
  public void testFormat_ValidString() {
    WordCleaner cleaner = new WordCleaner();
    String input = " -;Pneumono-ultramicroscopic-silicovolcanoconiosis._-;";
    String result = cleaner.format(input);
    String expected = "Pneumono-ultramicroscopic-silicovolcanoconiosis";
    assertEquals(expected, result);
  }
  @Test
  public void testFormat_EmptyString() {
    WordCleaner cleaner = new WordCleaner();
    String input = "";
    String result = cleaner.format(input);
    String expected = "";
    assertEquals(expected, result);
  }
  @Test
  public void testFormat_NullString() {
    WordCleaner cleaner = new WordCleaner();
    String input = null;
    String result = cleaner.format(input);
    String expected = null;
    assertEquals(expected, result);
  }
}
