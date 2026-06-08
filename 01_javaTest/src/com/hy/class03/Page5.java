package com.hy.class03;


public class Page5 {

	public static void main(String[] args) {
		// 배열 선언 정수[], 실수[], 문자[], 부울[], 문자열[] 배열
		int[] intArray = new int[10];
//		boolean[] boolArray = new boolean[4];
		
		arrPrint(intArray);
		
	}
	
	public static void arrPrint(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = i+10;
			System.out.println((i+1) + " : " +array[i]);
		}
		return;
	}
}
