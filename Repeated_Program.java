package com.java;

import java.util.*;
import java.util.Map.Entry;

public class Repeated_Program {

	public static void main(String[] args) {

		System.out.println("===Find the Occurence of Each Words===");

		String s = "Java is a Object Oriented and Java is a Object Class";

		String[] split = s.split(" ");

		Map<String, Integer> map = new HashMap<>();

		for (String str : split) {
			if (map.containsKey(str)) {
				Integer integer = map.get(str);
				map.put(str, integer + 1);
			} else {
				map.put(str, 1);
			}
		}
		System.out.println(map);

		System.out.println("===Find the duplicate of each word===");

		System.out.println("===Entry Set===");

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + "=" + entry.getValue());
			}

		}

		System.out.println("===Find the Occurence Of Each Char===");

		String s1 = "Java is Object Oriented";

		String replace = s1.replace(" ", "");

		char[] charArray = replace.toCharArray();

		Map<Character, Integer> map1 = new HashMap<>();

		for (char c : charArray) {
			if (map1.containsKey(c)) {
				Integer integer = map1.get(c);
				map1.put(c, integer+1);
			} 
			else {
				map1.put(c, 1);
			}
		}
		System.out.println(map1);
		
		System.out.println("===Find The Duplicate Of Each Char===");
		
		Set<Entry<Character, Integer>> entrySet2 = map1.entrySet();
	
		for (Entry<Character, Integer> entry : entrySet2) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey()+"="+entry.getValue());
			}
		}

	
	}

}
