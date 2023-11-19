package com.wordcounter;

/**
 * Class for cleaning words of non-alphanumeric characters.
 * Apart from alphanumeric characters allows for hyphens if a part of the word (not in the beginning or the end of the word).
 */

public class WordCleaner extends StringFormatter {
	@Override
	public String format(String string) {
    if(string == null) {
      return null;
    }
		String newString = string.replaceAll("([^a-zA-Z0-9]+)-|-([^a-zA-Z0-9]+)|^-+|-+$|[^a-zA-Z0-9-]","");
		return newString;
	}
}
