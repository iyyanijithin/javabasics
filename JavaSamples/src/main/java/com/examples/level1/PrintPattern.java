package com.examples.level1;

public class PrintPattern {

	
	public static void floydsTriangle() {
		int count = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		floydsTriangle();

	}

}
