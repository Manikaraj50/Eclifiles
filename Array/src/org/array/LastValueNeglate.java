package org.array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LastValueNeglate {
		public static void main(String[] args) {
			String s1="welcome to java";
			String[] split = s1.split(" ");
			String s="";
		//	char[] charArray = split.toCharArray();
			Map<String,String>mp=new LinkedHashMap<>();
			for(int i=0;i<split.length;i++) {
				if(mp.containsKey(split[i])) {
					
				}else {
					mp.put(split[i], split[1]);
				}
			}
			Set<Entry<String, String>> entrySet = mp.entrySet();
			for (Entry<String, String> entry : entrySet) {
				s=s+entry.getKey();
			}
			System.out.print(s);
		}
}
