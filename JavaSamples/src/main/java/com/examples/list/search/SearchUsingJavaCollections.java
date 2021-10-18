package com.examples.list.search;

import java.util.Arrays;
import java.util.List;

public class SearchUsingJavaCollections {

	
	public static List<String> getNames(){
		
		return Arrays.asList("nikhil","sandeep","rohit");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//searching in list
		List<String> names = getNames();		
		System.out.println(names.stream().filter(name->name.equalsIgnoreCase("sandeep")).count() > 0 ? "Found sandeep":"Did not find sandeep");
		System.out.println(names.stream().filter(name->name.equalsIgnoreCase("rajesh")).count() > 0 ? "Found rajesh":"Did not find rajesh");		
		
	}

}

