package org.machine;

import java.util.Scanner;

public class ATMmachine {
	public static void main(String[] args) {
		int accountNumber=123456789;
		int pinNumber=1234;
		int accountBalance=10000;
	    System.out.println("welcome to the jona bank");
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the Account Number");
	    int number=s.nextInt();
	    System.out.println("Enter the pin");
	    int pin=s.nextInt();
	    for(int i=0;i<3;i++) {
	    if(accountNumber==number) {
	    	if(pinNumber==pin) {
	    		System.out.println("Type 1-Widthdraw");
	    		System.out.println("Type 2-accountBalance");
	    		System.out.println("Type 3-Exit");
	    		System.out.println("enter the Type");
	    		int n=s.nextInt();
	    		switch(n)
	    		{
	    		case 1:
	    			
	    			System.out.println("Enter the amount");
	    			int amount=s.nextInt();
	    			if(accountBalance>amount) {
	    			System.out.println("current balance is "+ (accountBalance-amount));
	    			break;}
	    			else {
	    				System.out.println("insufficient balance");
	    				
	    			}
	    		case 2:
	    			System.out.println("current account balance  "+accountBalance);
	    			break;
	    		case 3:
	    			System.out.println("exit account");
	    			break;
	    		default:
	    		System.out.println("your type number is wrong");
	    		
	    		}}}else {
	    			System.out.println("your Account Number or Pin Number is wrong");
	    		} 
	    			
	    }

	    		

	    		
	    	}
	    }
	    
	


