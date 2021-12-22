package sampleProj.javaAssignments.assignment5;

import java.util.Date;

public class Pair {
	
	private String key;
	private String value;
	
	public Pair(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public Pair(String key, Date value) {
		this.key = key;
		this.value = String.valueOf(value);
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
