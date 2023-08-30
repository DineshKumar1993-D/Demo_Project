package com.java;

public class Single_Parent {

	public void studentName() {
		System.out.println("Name:Salaman");
	}
	
	public void studentAge() {
		System.out.println("Age:25");
		
		
	}
	
	public static void main(String[] args) {
		Single_Parent s = new Single_Parent();
		Single_Child s1 = new Single_Child();
		s.studentName();
		s.studentAge();
		s1.studentId();
	}
}
