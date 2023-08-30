package com.java;

public class Bio_Details {

	private void studentName(String name) {   //DataType
		System.out.println(name);
	}

	private void studentName(int age,char blood) {  //DataType Order
		System.out.println(age+""+blood);
	}
	
	private void studentName(char num,int group) {
		System.out.println(num+""+group);
	}
	private void studentName(int a,int b,int c) {  //DataType count
		System.out.println(a+b+c);
	}
	private void studentName(long id) {
		System.out.println(id);
	}

	private void studentName(float perc) {
		System.out.println(perc);
	}

	private void studentName(char gender) {
		System.out.println(gender);
	}

	public static void main(String[] args) {
	Bio_Details bc = new Bio_Details();
	bc.studentName(75.88f);
	bc.studentName(24,'A');
	bc.studentName('B',6767);
	bc.studentName(3874676477l);
	bc.studentName("Janani");
	bc.studentName(3,5,8);
	bc.studentName('f');
	
	
	
	
}

}
