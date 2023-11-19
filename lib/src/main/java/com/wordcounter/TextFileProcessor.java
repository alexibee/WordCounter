package com.wordcounter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Class for processing text files.
 */

public class TextFileProcessor {

  /**
   * Splits a text file into a list of strings.
   *
   * @param filePath path to the text file (String)
   * @param delimiter delimiter for splitting the text file (String)
   * @param formatter formatter for formatting the strings (StringFormatter)
   * @return list of strings split by the delimiter provided(List<String>)
   * @throws FileNotFoundException if the file is not found
   */

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
