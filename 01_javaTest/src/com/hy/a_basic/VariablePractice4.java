package com.hy.a_basic;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		// 국 영 수 총점과 평균
		Scanner sc = new Scanner(System.in);
		
		//국어 점수
		System.out.println("국어 점수를 입력해주세요 : ");
		double kor = sc.nextDouble();
				
		//영어 점수
		System.out.println("영어 점수를 입력해주세요 : ");
		double eng = sc.nextDouble();
		
		//수학 점수
		System.out.println("수학 점수를 입력해주세요 : ");
		double math = sc.nextDouble();
		
		//총점
		int sum = (int) (kor + eng + math);
		//평균
		int avg = sum /3;
		
		System.out.println("==================");
		System.out.printf("국어 : %.1f \n",kor);
		System.out.printf("영어 : %.1f \n",eng);
		System.out.printf("수학 : %.1f \n",math);
		System.out.printf("총점 : %d \n",sum);
		System.out.printf("평균 : %d \n" ,avg);
		System.out.println("==================");

	}

}
