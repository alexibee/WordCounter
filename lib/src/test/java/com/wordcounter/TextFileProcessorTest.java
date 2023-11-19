package com.wordcounter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.FileNotFoundException;


public class TextFileProcessorTest {
  @Test
  public void testSplitTextFile_ValidFilePath() {
    TextFileProcessor textFileProcessor = new TextFileProcessor();
    String filePath = "src/test/resources/test.txt";
    String delimiter = "\n|\\s";
    StringFormatter formatter = new WordCleaner();
    try {
      assertEquals(6, textFileProcessor.splitTextFile(filePath, delimiter, formatter).size());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testSplitTextFile_InvalidFilePath() {
    TextFileProcessor textFileProcessor = new TextFileProcessor();
    String filePath = "src/test/resources/test2.txt";
    String delimiter = "\n|\\s";
    StringFormatter formatter = new WordCleaner();
    try {
      textFileProcessor.splitTextFile(filePath, delimiter, formatter);
    } catch (Exception e) {
      assertEquals(FileNotFoundException.class, e.getClass());
    }
  }
}
