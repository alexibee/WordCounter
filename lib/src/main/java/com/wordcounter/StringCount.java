package com.wordcounter;

import java.util.Comparator;

public class StringCount {
	public static final Comparator<StringCount> STRING_COUNT_COUNTER_COMPARATOR = Comparator.comparingInt(StringCount::getCount);
	public static final Comparator<StringCount> STRING_COUNT_NAME_COMPARATOR = Comparator.comparing(StringCount::getName);
	
	private String name;
	private int count;
	
	
	public StringCount(String name) {
		this.name = name;
		count = 1;
	}
	
	public int getCount() {
		return count;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public void addOne() {
		this.count += 1;
	}
}
