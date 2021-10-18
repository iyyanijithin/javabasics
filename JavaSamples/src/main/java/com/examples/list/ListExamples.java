package com.examples.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListExamples {

	public static void print(List<String> data) {
		data.forEach(name -> System.out.print(String.format("%s ,",name)));
		System.out.println("");
	}
	
	public static List<String> buildDataList() {

		List<String> names = new ArrayList<>();
		names.add("roger");
		names.add("rafael");
		names.add("superman");
		return names;
	}

	public static void main(String[] args) {

		List<String> names = buildDataList();

		// Size of the list
		System.out.println(names.size());

		// print every element in the list
		print(names);

		// make the list empty
		names.clear();

		// add elements again
		names.add("roger");
		names.add("rafael");
		names.add("superman");

		// remove the second element by index
		names.remove(1);
		print(names);
		
		//init and array with pre defined capcity
		names = new ArrayList<>(500);
		names = buildDataList();
		//copy array from another array				
		System.out.println(names.hashCode());
		names = new ArrayList<>(names);
		System.out.println(names.hashCode());
		
		
		//delete an element from list
		print(names);
		names.remove("roger");
		print(names);
		
		//check if list contains roger
		names = buildDataList();
		Optional<String> rogerStr = names.stream().filter(name->name.equalsIgnoreCase("roger")).findAny();
		System.out.println(rogerStr.isPresent() ? "Found roger" : "Could not find roger");
		
		Optional<String> neilStr = names.stream().filter(name->name.equalsIgnoreCase("neil")).findAny();
		System.out.println(neilStr.isPresent() ? "Found neil" : "Could not find neil");
		
		
		
	}

}
