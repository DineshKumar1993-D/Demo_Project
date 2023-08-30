package com.java;

public class Over2 extends Over1 {

	@Override
	public void studentName(String name, int age) {
		
		super.studentName(name, age);
	}
	@Override
	public void childName(String name, int age) {
		
		super.childName(name, age);
	}
	public static void main(String[] args) {
		Over2 o= new Over2();
		o.studentName("Janani",28);
		o.childName("Lakshana",5);
	}
}
