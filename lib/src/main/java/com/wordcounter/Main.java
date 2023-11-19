package com.wordcounter;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		try {
			if(args.length == 0) {
				throw new IllegalArgumentException("At least one argument required, arguments allowed are as follows:\n"
						+ "1 - Path to the file\n" + "2 - Case Sensitive - true or false (false by default)\n" + "3 - Delimiter (white space and new line are the default)\n");
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			System.exit(1);
		}
		String filePath = args[0];
		String delimiter = "\n|\\s";
		boolean isCaseSensitive = false;

		if(args.length > 1) {
			isCaseSensitive = args[1].toLowerCase().equals("true") ? true : false;
		}
		if(args.length > 2) {
			delimiter = args[2];
		}

		StringFormatter formatter = new WordCleaner();
		TextFileProcessor textProcessor = new TextFileProcessor();
	  Counter counter = new Counter();
	  Comparator<StringCount> stringCountComparator = StringCount.STRING_COUNT_COUNTER_COMPARATOR.reversed().thenComparing(StringCount.STRING_COUNT_NAME_COMPARATOR);

		try {
			List<String> wordList = textProcessor.splitTextFile(filePath, delimiter, formatter);
			List<StringCount> wordCountList = counter.countUnique(wordList, isCaseSensitive);
			Collections.sort(wordCountList, stringCountComparator);
			for(StringCount wordCount : wordCountList) {
				System.out.println(wordCount.getName() + " " + wordCount.getCount());
			}
	    } catch(FileNotFoundException e) {
	    	e.printStackTrace();
	    	System.exit(1);
	    }


	}

}
