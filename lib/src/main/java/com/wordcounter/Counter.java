package com.wordcounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Counter {

   /**
     * Counts unique strings in a list.
     *
     * @param listToCount list of strings to be counted (List<String>)
     * @param isCaseSensitive whether to count strings with different cases as unique (boolean)
     * @return list of StringCount objects (List<StringCount>)
     */

  public List<StringCount> countUnique(List<String> listToCount, boolean isCaseSensitive) {

		HashMap<String,StringCount> map = new HashMap<>();
    if(listToCount == null) {
      return new ArrayList<StringCount>();
    }
		for (String string : listToCount) {
			if(string.isBlank()) {
				continue;
			}
			String stringToCount = isCaseSensitive ? string : string.toLowerCase();
			StringCount stringCountObj = (StringCount) map.get(stringToCount);
			if(stringCountObj == null) {
				map.put(stringToCount, new StringCount(stringToCount));
			} else {
				stringCountObj.addOne();
			}
		}
		List<StringCount> stringCountList = new ArrayList<>(map.values());
		return stringCountList;
	}
}
