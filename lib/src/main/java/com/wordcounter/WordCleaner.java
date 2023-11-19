package com.wordcounter;

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
