package com.wordcounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Counter {

	public List<StringCount> countUnique(List<String> listToCount, boolean isCaseSensitive){

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
