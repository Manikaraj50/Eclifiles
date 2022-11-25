package org.string;

public class LiteralString {
	public static void main(String[] args) {
	String s = "Boo";
	String s1 = "Boo";
	     int identityHashCode = System.identityHashCode(s);
		System.out.println(identityHashCode);
		int identityHashCode2 = System.identityHashCode(s1);
		System.out.println(identityHashCode2);

	}
}