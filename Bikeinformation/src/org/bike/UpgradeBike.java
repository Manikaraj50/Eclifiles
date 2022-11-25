package org.bike;

public class UpgradeBike extends BIke {
	@Override
	public void cost(int a) {
		// TODO Auto-generated method stub
		System.out.println("the bike upgrate version     "+a);
		super.cost(1000000);
	}
	@Override
	public void speed(String topSpeed) {
		// TODO Auto-generated method stub
		System.out.println("the bike upgrade version is    "+ topSpeed);
		super.speed("100km");
	}
	public static void main(String [] args) {
		UpgradeBike u=new UpgradeBike();
		u.cost(120000);
		u.speed("120km");

}
}

