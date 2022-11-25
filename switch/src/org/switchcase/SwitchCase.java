package org.switchcase;
import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number: ");
		int firstNumber=s.nextInt();
		System.out.println("enter the second number: ");
		int secondNumber=s.nextInt();
		System.out.println("only using  for operators +,-,*,/ :");
		char operator=s.next().charAt(0);
		switch(operator) {
		case '+' :
			System.out.println("plus value is for result  :" +(firstNumber+secondNumber));
			break;
		case '-' :
			System.out.println("minus value is for result :" +(firstNumber+secondNumber));
			break;
		case '*' :
			System.out.println("multple value is for result :" +(firstNumber+secondNumber));
			break;	
		case '/' :
			System.out.println("divide value is for result  :" +(firstNumber+secondNumber));
			break;
		default :
		System.out.println("error operators");
		
		break;
		}{
		
		System.out.println("enter the first number: ");
		int firstNumber1=s.nextInt();
		System.out.println("enter the second number: ");
		int secondNumber1=s.nextInt();
		System.out.println("only using  for operators +,-,*,/ :");
		char operator1=s.next().charAt(0);
		switch(operator1) {
		case '+' :
			System.out.println("plus value is for result  :" +(firstNumber1+secondNumber1));
			break;
		case '-' :
			System.out.println("minus value is for result :" +(firstNumber1+secondNumber1));
			break;
		case '*' :
			System.out.println("multple value is for result :" +(firstNumber1+secondNumber1));
			break;	
		case '/' :
			System.out.println("divide value is for result  :" +(firstNumber1+secondNumber1));
			break;
		default :
		System.out.println("error operators");
		
		
		
		
	}
	}
}
}
