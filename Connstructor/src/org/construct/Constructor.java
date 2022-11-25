package org.construct;


public class Constructor  {
	public Constructor() {

		 System.out.println("jo");
	}
	public  Constructor(int a) {
		// TODO Auto-generated method stub
		
		System.out.println("sin");

	}
	public  Constructor(String name) {
		
		System.out.println("no");
	}
	public static void main(String[] args) {
		Constructor c=new Constructor();
		Constructor c1=new Constructor("jo");
		Constructor c2=new Constructor(1234);
		
	}
}
