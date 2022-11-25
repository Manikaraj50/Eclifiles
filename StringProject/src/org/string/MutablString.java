package org.string;

public class MutablString {
	public static void main(String[] args) {
		{ //mutable string using two types -1.String Buffer 2.StringBuilder 
			//there are same types but small change
			//mutable string -non literal string using the keyword "append"
			// this process is using the append function first input on locate the same memory location
		StringBuffer s=new StringBuffer("welcome");
		StringBuffer s1=new StringBuffer("java");
		StringBuffer s2=new StringBuffer("jona");
		int identityHashCode = System.identityHashCode(s);
		System.out.println(identityHashCode);
		int identityHashCode2 = System.identityHashCode(s1);
		System.out.println(identityHashCode2);
		int identityHashCode3 = System.identityHashCode(s2);
		System.out.println(identityHashCode3);
		int identityHashCode4 = System.identityHashCode(s1.append(s2));
		System.out.println(identityHashCode4);}
		System.out.println("Mutable String  ");{
		//immutable string -literal string using the keyword "concat".
		// this process is concat using two string add creates the another memory location
	  String name="welcome";
	  String name1="java";
	  String name2="java";
	  int identityHashCode = System.identityHashCode(name);
	  System.out.println(identityHashCode);
	  int identityHashCode2 = System.identityHashCode(name1);
	  System.out.println(identityHashCode2);
	  int identityHashCode3 = System.identityHashCode(name2);
	  System.out.println(identityHashCode3);
	  int identityHashCode4 = System.identityHashCode(name.concat(name2));
	  System.out.println(identityHashCode4);}
	System.out.println("");{
		//this mutable string using for StringBuilder
		  StringBuilder j=new StringBuilder("jona");
		  StringBuilder j1=new StringBuilder("jara");
		  int identityHashCode = System.identityHashCode(j);
		  System.out.println(identityHashCode);
		  int identityHashCode2 = System.identityHashCode(j1);
		  System.out.println(identityHashCode2);
		  int identityHashCode3 = System.identityHashCode(j.append(j1));
		  System.out.println(identityHashCode3);}
}
}
