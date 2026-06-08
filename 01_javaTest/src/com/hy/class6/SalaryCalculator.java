package com.hy.class6;

import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		// 월급, 상여급을 가지고 연봉 계산 후 출력
		Scanner sc = new Scanner(System.in);
		
		//월급 입력
		System.out.println("월급을 입력해주세요.");
		int monthPay = sc.nextInt();
		
		//상여급
		System.out.println("상여금을 입력해주세요");
		int bonus = sc.nextInt();
		
		int yearPay = (monthPay*12) + bonus;
		
		System.out.println("===========");
		System.out.printf("당신의 연봉은 : %d \n", yearPay);
		System.out.println("===========");

	}

}
