package com.revature.model;

public class SwapiData {
	
	public int parseId(String url) {
		String array[] = url.split("/");
		return Integer.parseInt(array[array.length - 1]);
	}
	
	public int[] parseIds(String[] urls) {
		int length = urls.length;
		int[] ids = new int[length];
		for(int i=0;i<length;i++) {
			ids[i] = parseId(urls[i]);
		}
		return ids;
	}

}
