package org.array;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurence {
	public static void main(String[] args) {
		String str="java is is programming langurage";
		String[] rev=str.split(" ");
		Map<String,Integer> mp=new LinkedHashMap<>();
		mp.put("java", 1);
		for (String c : rev) {
			if(mp.containsKey(c)) {
				Integer count = mp.get(c);
				mp.put(c, count+1);
			}else {
				mp.put(c, 1);
			}
			
			
		}
		System.out.println(mp);
	}

}
