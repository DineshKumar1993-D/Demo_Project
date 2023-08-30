package com.java;

public class Method_Ol {

	private void studentName(String name) {
		System.out.println(name);

	}

	private void studentName(int num, double id) {
		System.out.println(num + " " + id);

	}

	private void studentName(char gender) {
		System.out.println(gender);

	}

	private void studentName(float height) {
		System.out.println(height);

	}

	public static void main(String[] args) {
		Method_Ol ov = new Method_Ol();
		ov.studentName("Dinesh");
	}

}
