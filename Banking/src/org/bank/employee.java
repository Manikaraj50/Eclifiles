package org.bank;

public class employee implements bank {
	@Override
	public void savings() {
		// TODO Auto-generated method stub
		System.out.println("the saving amount in bank");
		
	}
	@Override
	public void fixed() {
		// TODO Auto-generated method stub
		System.out.println(" the fixed amount is bank");
	}
	public static void main(String[] args) {
		employee e=new employee();
		e.fixed();
		e.savings();
	}

}
