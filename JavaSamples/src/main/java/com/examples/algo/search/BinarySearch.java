package com.examples.algo.search;

public class BinarySearch {

	public static boolean binarySearch(int[] sortedData, int element) {

		boolean isElementFound = false;

		int low = 0, high = sortedData.length;
		int mid = 0;
		while (low <= high) {

			mid = (low + high) / 2;
			if (sortedData[mid] == element) {
				isElementFound = true;
				break;
			} else if (sortedData[mid] < element) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return isElementFound;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sortedData = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		System.out.println("Search element " + binarySearch(sortedData, 8));
		System.out.println("Search element " + binarySearch(sortedData, 9));

	}

}
