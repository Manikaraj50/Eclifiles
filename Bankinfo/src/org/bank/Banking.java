package org.bank;

public class Banking  extends BankDeails{
	@Override
	public void savings(int amount) {
		// TODO Auto-generated method stub
		System.out.println("the new saving amount is      " +amount);
		super.savings("jona");
	}
	public static void main(String[] args) {
		Banking b=new Banking();
		b.savings(12000);
	}
}
