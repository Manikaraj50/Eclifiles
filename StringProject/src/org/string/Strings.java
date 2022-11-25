package org.string;

public class Strings {
	public static void main(String[] args) {
		String s="welcome";
		char[] x=s.toCharArray();
		for (char c : x) {
			System.out.println(c+" ");}
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		char charAt = s.charAt(0);
		System.out.println(charAt);
		int indexOf = s.indexOf('e');
		System.out.println(indexOf);
		boolean empty = s.isEmpty();
		System.out.println(empty);
		boolean startsWith = s.startsWith("l");
		System.out.println(startsWith);
		boolean endsWith = s.endsWith("m");
		System.out.println(endsWith);
		int lastIndexOf = s.lastIndexOf('e');
		System.out.println(lastIndexOf);
		boolean contains = s.contains("le");
		System.out.println(contains);
	    String j="welcome";
	    String j1="WELCOME";
	    boolean equals = j.equals(j1);
	    System.out.println(equals);
	    boolean equalsIgnoreCase = j.equalsIgnoreCase(j1);
	    System.out.println(equalsIgnoreCase);
	    int length = j.length();
	    System.out.println(length);
	    String replace = j.replace('c', 'r');
	    System.out.println(replace);
	    String replaceAll = j.replaceAll("welcome", "jona");
	    System.out.println(replaceAll);
		String s3="  welcome to java  ";
		String trim = s3.trim();
		System.out.println(trim);
		String substring = s3.substring(2);
		System.out.println(substring);
		String substring2 = s3.substring(1, 5);
		System.out.println(substring2);
	    
	    
	

	}
}
