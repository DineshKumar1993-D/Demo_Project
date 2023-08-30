package com.java;

public class Reverse_String {
	
	public static void main(String[] args) {
		
		System.out.println("=====Reverse String=====");
		
		String s ="Welcome to java";
		
		for (int i = s.length()-1; i >=0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("=====To Get the particular character and count====");
	
		String s1 = "java is a object oriented";
		
		String replace = s1.replace(" ", "");
		int count=0, count1=0;
		for(int i=0;i<replace.length();i++) {
			if (replace.charAt(i)=='e') {
				System.out.print(replace.charAt(i));
				count++;
			}
			else if (replace.charAt(i)>'a'&& replace.charAt(i)<'z') {
				
				count1++;
			}
		}
		System.out.println(count);
		System.out.println(count1);
	}

}
