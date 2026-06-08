package com.hy.a_basic;

import java.util.Scanner;

public class VariablePractice3 {

	public static void main(String[] args) {
		// 사각형 면적과 둘레
		Scanner sc = new Scanner(System.in);
		
		//숫자1
		System.out.println("가로를 입력해주세요 : ");
		double num1 = sc.nextDouble();
		
		//숫자2
		System.out.println("세로를 입력해주세요 : ");
		double num2 = sc.nextDouble();
		
		double me = num1 *num2;
		double du = (num1 + num2) *2; 
		
		System.out.println("==================");
		System.out.printf("둘레 : %.2f \n",me);
		System.out.printf("면적 : %.1f \n",du);
		System.out.println("==================");

	}

}
