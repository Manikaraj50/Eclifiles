package org.bank;

public class Reverse {
	public static void main(String[] args) {
		String name="jona";
		String rev="";
		rev=rev+name.charAt(3);
		rev=rev+name.charAt(2);
		rev=rev+name.charAt(1);
		rev=rev+name.charAt(0);
		System.out.println(" the revers name is "+rev);
		 
		// another method using reverse name
		
		String replaceAll = name.replaceAll("jona", "anoj");
		System.out.println(replaceAll);
	
	}

}
