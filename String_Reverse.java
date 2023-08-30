package com.java;

public class String_Reverse {

	public static void main(String[] args) {

		String s = "Dinesh Kumar";

		System.out.println("==To Get Count Of String==");

		String[] split = s.split(" ");
		System.out.println(split.length);

		System.out.println("==To Get Char Length With Space==");

		System.out.println(s.length());

		System.out.println("==To Get Char Length Without Space==");

		String replace = s.replace(" ", "");
		System.out.println(replace.length());

		System.out.println("==To Get Repeated and Vowel Char==");

		char[] charArray = s.toCharArray();

		int count = 0;

		for (char c : charArray) {
			if (c == 'a' || c == 'i') {
				System.out.println(c);
				count++;
			}
		}
		System.out.println(count);
	
		System.out.println("==Reverse String==");
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	
		System.out.println();
		
		System.out.println("==Reverse String Next==");
		
		String s1="Java Is Object";
		
		String[] words = s1.split(" ");
		
		String output="";
		
		for(int j=words.length-1;j>=0;j--) {
			
			output=output+words[j]+" ";
		}
		
		System.out.println(output);
	}

}
