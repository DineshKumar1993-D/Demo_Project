package com.java;

public class Class_B_Child extends Class_A_Parent {

	@Override
	public void studentName() {
		System.out.println("Janani");
		super.studentName();
	}
	@Override
	public void childName() {
		
		super.childName();
	}
	public void childName1() {
		System.out.println("Lakshana");

	}
	
	public void playerName() {
		System.out.println("Sachin");

	}
	
	public static void main(String[] args) {
		Class_A_Parent c = new Class_B_Child();  //a=10  upcasting
		c.studentName();
		c.childName();
		
		
		
	}

}
