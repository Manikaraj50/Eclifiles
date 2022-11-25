package org.array;


public class StringReverse {
	public static void main(String[] args) {
		String name="dinesh kumar";
		String rev="";
		int length = name.length();
		for (int i = length-1;i>=0;i--) {
			rev=rev+name.charAt(i);
			
			}
		String[] split = name.split(" ");
		String last="";
	    for (String string : split) {
			System.out.println(string);
			for (int i = 0; i < split.length; i++) {
				last=last+string.charAt(i);
			}
			System.out.println(last);
		}
      
        
       
	}
}


