package com.examples.algo.sort;

import java.util.Random;

public class BubbleSort {

	
	public static int[] bubbleSort(int[] unsorted) {

		for (int i = 0; i < unsorted.length - 1; i++) {
			for (int j = 0; j < unsorted.length - 1; j++) {
				if (unsorted[j] > unsorted[j + 1]) {					// swamp
					int temp = unsorted[j];
					unsorted[j] = unsorted[j + 1];
					unsorted[j + 1] = temp;
				}
			}
		}
		return unsorted;
	}
	
	public static int[] bubbleSortV2(int[] unsorted) {

		for (int i = 0; i < unsorted.length - 1; i++) {
			for (int j = 0; j < unsorted.length - 1 -i; j++) {
				if (unsorted[j] > unsorted[j + 1]) {					// swamp
					int temp = unsorted[j];
					unsorted[j] = unsorted[j + 1];
					unsorted[j + 1] = temp;
				}
			}
		}
		return unsorted;
	}
	
	public static int[] getBigArray() {
		//5,00,000  0.5 m records
		int[] unsorted = new int[500000];
		for(int i=0; i< unsorted.length;i++) {
			unsorted[i] = new Random().nextInt();
		}
		return unsorted;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 5, 4, 3, 2, 1 };
		int[] sorted = bubbleSort(data);
		for (int element : sorted) {
			System.out.print(element + " ");
		}
		System.out.println("\nBulding data");
		data = getBigArray();
		System.out.println("Done Bulding data");
		long startTime = System.currentTimeMillis();
		System.out.println("Starting sort ");
		bubbleSort(data);
		System.out.println("Sorted in " + data.length + " in " + (System.currentTimeMillis()-startTime) + " ms");
		
		System.out.println("Starting sort V2 ");
		bubbleSort(data);
		System.out.println("Sorted in " + data.length + " in " + (System.currentTimeMillis()-startTime) + " ms");
		
		//looks to be very slow even on i5 with 16 gb it takes a lot of time
		/*
		1 2 3 4 5 
		Bulding data
		Done Bulding data
		Starting sort 
		Sorted in 500000 in 520266 ms
		Starting sort V2 
		Sorted in 500000 in 652579 ms
		*/

		
	}

}
