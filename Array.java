package com.java;

public class Array {
	
	public static void main(String[] args) {
		
		
		int a[][]= {{1,2,3},{2,4,5},{4,4,5}};
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(a[i][j]);
			}
		System.out.println();
		}
	
		int [][][]arr= new int[1][2][3];
		
		for(int k=0;k<=3;k++) {
			for(int l=0;l<=3;l++) {
				System.out.println(arr[k][l]+" ");
			}
		}
	
	}

}
