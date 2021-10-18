package com.examples.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>();		
		numbers.add(5);
		numbers.add(1);
		numbers.add(11);
		numbers.add(12);
		numbers.add(124);		
		numbers.add(-1);
		int smallest = numbers.get(0);
		for(Integer number : numbers) {
			if(number < smallest) {
				smallest = number;
			}
		}
		System.out.println("Smallest number is : " + smallest );
		
		//more advanced way
		Optional<Integer> smallestInList = numbers.stream().sorted().findFirst();
		System.out.println("Smallest number is " + smallestInList.get());
	}

}
