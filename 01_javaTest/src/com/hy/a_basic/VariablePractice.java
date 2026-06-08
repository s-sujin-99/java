package com.hy.a_basic;

import java.util.Scanner;

public class VariablePractice {

	public static void main(String[] args) {
		// 이름 성별 나이 키를 입력 받고 출력
		Scanner sc = new Scanner(System.in);
		
		//이름 
		System.out.println("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		//성별
		System.out.println("성별을 입력해주세요 : ");
		String gender = sc.nextLine();
		
		//나이
		System.out.println("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		
		//키
		System.out.println("키를 입력해주세요 : ");
		double cm = sc.nextDouble();
		
		System.out.println("==================");
		System.out.printf("키 %.1f인 %d살 %s %s님 반갑습니다.^^ \n",cm, age, gender, name);
		System.out.println("==================");

	}

}
