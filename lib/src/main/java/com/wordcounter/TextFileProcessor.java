package com.wordcounter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFileProcessor {
	
	public List<String> splitTextFile(String filePath, String delimiter, StringFormatter formatter ) throws FileNotFoundException {
	       List<String> words = new ArrayList<>();
	       Scanner scanner = new Scanner(new File(filePath));
	       scanner.useDelimiter(delimiter);
	       
	       while (scanner.hasNext()) {
	           String nextWord = scanner.next();
	           String formattedWord = formatter.format(nextWord);
	           words.add(formattedWord);    
	       }
	       scanner.close();
	       return words;
	}
	 
}
