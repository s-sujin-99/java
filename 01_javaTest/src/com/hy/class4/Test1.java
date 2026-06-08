package com.hy.class4;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// 학생이름, 학번, 국 수 영 점수 받아 출력
		Scanner sc = new Scanner(System.in);
		
		//학생 이름
		System.out.println("당신의 이름은 ? ");
		String name = sc.nextLine();
		
		//학번
		System.out.println("당신의 학번은 ? ");
		int id = sc.nextInt();

		//수학
		System.out.println("당신의 수학 점수는 ? ");
		int math = sc.nextInt();
		
		//국어
		System.out.println("당신의 국어 점수는 ? ");
		int kor = sc.nextInt();
		
		//영어
		System.out.println("당신의 영어 점수는 ? ");
		int eng = sc.nextInt();
		
		int sum = kor + eng + math;
		
		System.out.println("=====================");
		System.out.printf(" 이름     : %s",name);
		System.out.printf("\n 학번     : %d",id);
		System.out.printf("\n 수학 점수 : %d",math);
		System.out.printf("\n 국어 점수 : %d",kor);
		System.out.printf("\n 영어 점수 : %d",eng);
		System.out.printf("\n 합계     : %d",sum);
		System.out.println("\n=====================");
		
				
	}

}
