package com.wordcounter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

/**
 * Class for sorting StringCount objects.
 */

public class WordCountSorter {

  /**
   * Sorts a list of StringCount objects by count(desc) then name(asc).
   *
   * @param wordCountList list of StringCount objects to be sorted (List<StringCount>)
   * @return sorted list of StringCount objects (List<StringCount>)
   */

  public List<StringCount> sortStringCountsByCountDescThenName(List<StringCount> wordCountList) {

    if(wordCountList == null) {
      return new ArrayList<StringCount>();
    }

    Comparator<StringCount> stringCountComparator = StringCount.STRING_COUNT_COUNTER_COMPARATOR.reversed().thenComparing(StringCount.STRING_COUNT_NAME_COMPARATOR);
    Collections.sort(wordCountList, stringCountComparator);
    return wordCountList;

  }
}
