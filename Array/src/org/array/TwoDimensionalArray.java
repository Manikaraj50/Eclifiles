package org.array;

public class TwoDimensionalArray {
     public static void main(String[] args) {
		int [][]a= {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(""+a[i][j]);
			}
			System.out.println("");
		}
		for (int[] x : a) {
			for ( int s : x) {
				System.out.println(""+s);
				
			}
			System.out.println("");
			
		}
	}
}
