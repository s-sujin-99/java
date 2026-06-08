package com.hy.class6;

import java.util.Scanner;

public class AverageScore {

	public static void main(String[] args) {
		// 영어 과학 과목 입력후 평균 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영어 점수 입력해주세요 ");
		int eng = sc.nextInt();
		
		System.out.println("과학 점수 입력해주세요 ");
		int science = sc.nextInt();
		
		int avg = (eng+science)/2;
		
		System.out.println("=============");
		System.out.printf("평균 : %d \n",avg);
		System.out.println("=============");

	}

}
