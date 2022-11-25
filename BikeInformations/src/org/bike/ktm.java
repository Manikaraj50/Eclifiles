package org.bike;

public class ktm implements BIke{
	@Override
	public void cost(int rate) {
		// TODO Auto-generated method stub
		System.out.println("the ktm amount is"+rate);
	}
	@Override
	public void speed(int speed) {
		// TODO Auto-generated method stub
		System.out.println("the ktm speed is "+speed);
	}
	public static void main(String[] args) {
		ktm bike=new ktm();
		bike.cost(120000);
		bike.speed(160);
	}

}
