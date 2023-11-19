package com.wordcounter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DataSorter {

	public LinkedHashMap<String,Integer> sortMapByValue(Map<String,Integer> map, String order){
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		List<String> keyList = new ArrayList<>();
		List<Integer> valueList = new ArrayList<>();
    int length = entrySet.size();

		for (Map.Entry<String, Integer> entry : entrySet) {
			keyList.add(entry.getKey());
			valueList.add(entry.getValue());
	  }
		quickSort(valueList, keyList, 0, length-1, order);

		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

		for(int i = 0; i < length; i++) {
			sortedMap.put(keyList.get(i), valueList.get(i));
		}

		return sortedMap;
	}



	private static void quickSort(List<Integer> valueList, List<String> keyList, int low, int high, String order) {
    if (low < high) {
      int partitionIndex = partition(valueList, keyList, low, high, order);

      quickSort(valueList, keyList, low, partitionIndex - 1, order);
      quickSort(valueList, keyList, partitionIndex + 1, high, order);
    }
  }

  private static int partition(List<Integer> valueList, List<String> keyList, int low, int high, String order) {
    int pivot = valueList.get(high);
    int i = low - 1;

    for (int j = low; j < high; j++) {
      boolean comparison = order == "asc" ? valueList.get(j) <= pivot : valueList.get(j) >= pivot;
      if (comparison) {
        i++;

        int tempVal = valueList.get(i);
        valueList.set(i, valueList.get(j));
        valueList.set(j, tempVal);

        String tempKey = keyList.get(i);
        keyList.set(i, keyList.get(j));
        keyList.set(j, tempKey);
      }
    }

    int tempVal = valueList.get(i + 1);
    valueList.set(i + 1, valueList.get(high));
    valueList.set(high, tempVal);

    String tempKey = keyList.get(i + 1);
    keyList.set(i + 1, keyList.get(high));
    keyList.set(high, tempKey);

    return i + 1;
  }
}
