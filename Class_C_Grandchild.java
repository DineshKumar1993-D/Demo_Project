package com.java;

public class Class_C_Grandchild extends Class_B_Child {

	@Override
	public void studentName() {
		
		super.studentName();
	}
	@Override
	public void childName() {
		
		super.childName();
	}
	@Override
	public void childName1() {
		
		super.childName1();
	}
	public void traninerName() {
		System.out.println("Dinesh");
	}
	public static void main(String[] args) {
		Class_C_Grandchild c1 = new Class_C_Grandchild();
		c1.studentName();
		c1.childName();
		c1.childName1();
	}





}
