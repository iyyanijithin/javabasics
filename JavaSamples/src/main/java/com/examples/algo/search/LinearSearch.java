package com.examples.algo.search;

import java.util.Random;

public class LinearSearch {

	public static int[] getBigArray() {
		//1,000,000  0.5 m records
		int[] unsorted = new int[1000000];
		for(int i=0; i< unsorted.length;i++) {
			unsorted[i] = new Random().nextInt();
		}
		return unsorted;
	}
	
	public static boolean search(int[]data,int searchElement) {
				
		for(int dataElement : data) {
			if(dataElement == searchElement) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Loading data");
		int[] unsortedData = getBigArray();
		long startTime = System.currentTimeMillis();
		System.out.println("Results in " + search(unsortedData, unsortedData[unsortedData.length-3000]) + " " + (System.currentTimeMillis()-startTime));
		System.out.println("Results in " + search(unsortedData, 5555) + " " + (System.currentTimeMillis()-startTime));

	}

}

