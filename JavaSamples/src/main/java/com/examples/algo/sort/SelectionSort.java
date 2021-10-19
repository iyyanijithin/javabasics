package com.examples.algo.sort;

public class SelectionSort {

	
	public static int[] selectionSort(int[] unsorted) {

		for(int i=0; i < unsorted.length;i++) {			
			int min = unsorted[i];
			for(int j=i + 1; j < unsorted.length;j++) {
				if(unsorted[j] < min) {
					int temp = unsorted[j];
					unsorted[j] = unsorted[i];
					unsorted[i] = temp;
				}
			}
		}
		return unsorted;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = { 5, 4, 3, 2, 1 };
		int[] sorted = selectionSort(data);
		for (int element : sorted) {
			System.out.print(element + " ");
		}

	}

}
