package com.wordcounter;
import java.io.FileNotFoundException;
import java.util.List;

/**
 * Main class for the word counter program.
 */

public class Main {
	public static void main(String[] args) {
		try {
			if(args.length == 0) {
				throw new IllegalArgumentException("Path to the file is required!\n");
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			System.exit(1);
		}
		String filePath = args[0];
		String delimiter = "\n|\\s";
		boolean isCaseSensitive = false;

		StringFormatter formatter = new WordCleaner();
		TextFileProcessor textProcessor = new TextFileProcessor();
    Counter counter = new Counter();
    WordCountSorter wordCountSorter = new WordCountSorter();

		try {
			List<String> wordList = textProcessor.splitTextFile(filePath, delimiter, formatter);
      List<StringCount> wordCountList = counter.countUnique(wordList, isCaseSensitive);
      List<StringCount> sortedWordCountList = wordCountSorter.sortStringCountsByCountDescThenName(wordCountList);

			for(StringCount wordCount : sortedWordCountList) {
				System.out.println(wordCount.getName() + " " + wordCount.getCount());
			}
	  } catch(FileNotFoundException e) {
	    	e.printStackTrace();
	    	System.exit(1);
	  }
	}
}
