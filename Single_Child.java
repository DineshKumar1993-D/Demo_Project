package com.java;

public class Single_Child extends Single_Parent {

	@Override
	public void studentName() {
	//	System.out.println("Raja");
		super.studentName();
	}
	
	public void studentId() {
		System.out.println("Id:283839");
	}
	public static void main(String[] args) {
		Single_Child s = new Single_Child();
		s.studentName();
		s.studentAge();
		s.studentId();
	}

	
}


