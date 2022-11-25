package org.switchcase;

import java.util.Scanner;



public class SwitchCase1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" enter the vowels :");
		char vowels =s.next().charAt(0);
		switch(vowels) {
		case 'a' :
			System.out.println(vowels);
			break;
		case 'e' :
			System.out.println(vowels);
			break;
		case 'i' :
			System.out.println(vowels);
			break;	
		case 'o' :
			System.out.println(vowels);
			break;
		default :
		System.out.println("error vowels");
		}
		
		
	}

}
