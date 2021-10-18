package com.examples.level1;

public class PalindromeCheck {

	public static boolean checkIsPalindrome(String input) {		
		boolean isPalindrome = true;
		int start=0,stop=input.length()-1;
		while(start <= stop) {
			if(input.charAt(start) != input.charAt(stop)){
				isPalindrome = false;
				break;
			}else {
				start++;
				stop--;
			}
		}
		
		return isPalindrome;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Checking if string is palindrome");
		String inputString = "malayalam";
		System.out.println(inputString + " : " + checkIsPalindrome(inputString));
		inputString = "hamilton";
		System.out.println(inputString + " : " + checkIsPalindrome(inputString));
		inputString = "maam";
		System.out.println(inputString + " : " + checkIsPalindrome(inputString));
		
	}

}

