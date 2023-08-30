package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Revise_String {

	public static void main(String[] args) {

		String s = "Java is a Object Class";

		System.out.println("To Get String Count With Space");

		System.out.println(s.length());

		System.out.println("To Get String Count " + "Without Space");

		String replace = s.replace(" ", "");

		System.out.println(replace.length());

		System.out.println("To Get String Length");

		String[] split = s.split(" ");

		System.out.println(split.length);

		System.out.println("To Upper Case");

		char[] charArray = s.toCharArray();
		int count = 0;
		for (char c : charArray) {
			if (Character.isUpperCase(c)) {
				System.out.print(" " + c);
				count++;
			}
		}
		System.out.println(" " + count);

		// System.out.println();

		System.out.println("To Lower Case");
		int coun = 0;
		for (char c : charArray) {
			if (Character.isLowerCase(c))
				System.out.print(c);
			coun++;
		}
		System.out.println(" " + coun);

		System.out.println("Reverse String");

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("Reverse Word");

		for (int j = split.length - 1; j >= 0; j--) {
			System.out.print(" " + split[j]);
		}
		System.out.println();

		System.out.println("Vowels With Count");
		int cou = 0;
		for (char c : charArray) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				System.out.print(c);
				cou++;
			}
		}
		System.out.println(" " + cou);
		System.out.println();

		System.out.println("Find the occurence of word");

		Map<String, Integer> map = new HashMap<>();

		for (String s1 : split) {
			if (map.containsKey(s1)) {
				Integer integer = map.get(s1);
				map.put(s1, integer + 1);
			} else {
				map.put(s1, 1);
			}
		}
		System.out.println(map);

		System.out.println("Get Word");

		Set<Entry<String, Integer>> entrySet = map.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
		}

		System.out.println();

		System.out.println("Find The Occurence Of Char");

		Map<Character, Integer> map1 = new HashMap<>();

		for (char c1 : charArray) {
			if (map1.containsKey(c1)) {
				Integer integer = map1.get(c1);
				map1.put(c1, integer + 1);
			} else {
				map1.put(c1, 1);
			}
		}
		System.out.println(map1);

		System.out.println("Find The Duplicate");

		Set<Entry<Character, Integer>> entrySet2 = map1.entrySet();

		for (Entry<Character, Integer> entry1 : entrySet2) {
			System.out.println(entry1.getKey() + "=" + entry1.getValue());
		}
		
		System.out.println();
		
		System.out.println("Split Particular Symbol");
		
		String s1="Java@Object@Class";
		
		String[] split2 = s1.split("@");
		System.out.println(split2);
	}

}
