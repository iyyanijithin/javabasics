package com.examples.level1;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 1, 2, 3, 4, 5, 6 };
		int start = 0, stop = data.length - 1;
		while (start <= stop) {
			int temp = data[start];
			data[start] = data[stop];
			data[stop] = temp;
			start++;
			stop--;
		}

		for (int val : data) {
			System.out.print(" " + val);

		}
	}

}
