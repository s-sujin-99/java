package com.hy.class03;

import java.util.Scanner;

public class Exam03 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// 번호 선택

		while (true) {
			System.out.println("1 : 메뉴 출력 \n2 : 양수,홀짝수 구분 출력\n3 : 학점 출력\n4 : 계산 출력\n5 : 구구단\n6 : exit");
			int no = Integer.parseInt(sc.nextLine());
			switch (no) {
			case 1:
				program1();
				break;
			case 2:
				program2();
				break;
			case 3:
				program3();
				break;
			case 4:
				program4();
				break;
			case 5:
				program5();
				break;
			case 6:
				System.out.println("종료합니다.");
				System.exit(no);
				break;

			default:
				break;
			}

			if (no >= 1 && no <= 6) {
				continue;
			} else {
				System.out.println("번호가 없습니다.");
				break;
			}
		}

	}


	private static void program1() {
		// 메뉴 출력

		while (true) {
			System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료\n ");
			System.out.println("숫자를 입력해주세요");
			int num = Integer.parseInt(sc.nextLine());

			switch (num) {

			case 1:
				System.out.println("입력 메뉴입니다.");
				break;
			case 2:
				System.out.println("수정 메뉴입니다.");
				break;
			case 3:
				System.out.println("조회 메뉴입니다.");
				break;
			case 4:
				System.out.println("삭제 메뉴입니다.");
				break;
			case 7:
				System.out.println("프로그램 종료");
				break;
			default:
				break;
			}
			if (num >= 1 && num <= 5 || num == 7) {
				continue;
			} else {
				System.out.println("없는 번호입니다.");
				break;
			}
		}

	}

	private static void program2() {
		

		while (true) {
			// 양수로 정수값 받고 홀짝수 구분
			System.out.println("숫자를 입력해주세요");
			int num = Integer.parseInt(sc.nextLine());
			
			if (num % 2 == 0 && num > 0) {
				System.out.printf("%d는 짝수입니다.\n", num);
				break;
			} else if (num % 2 != 0 && num > 0) {
				System.out.printf("%d는 홀수입니다.\n", num);
				break;
			} else {
				System.out.println("양수만 입력해주세요");
				continue;
			}
		}
		
	}

	private static void program3() {
		
		while (true) {
			// 성적을 받아 학점 출력
			System.out.println("점수를 입력해주세요");
			int num = Integer.parseInt(sc.nextLine());
			
			if(num<0){
				System.out.println("다시 입력");
				continue;
			} else if (num >= 90) {
				System.out.println("A");
				break;
			} else if (num >= 80) {
				System.out.println("B");
				break;
			} else if (num >= 70) {
				System.out.println("C");
				break;
			} else {
				System.out.println("F");
				break;
			} 
			
			
		}
		
		
	}

	private static void program4() {
		
		while(true) {
			//두 숫자와 연산자 입력해 계산 
			System.out.println("숫자를 입력해주세요.");
			int num1 = Integer.parseInt(sc.nextLine());
			
			System.out.println("숫자를 입력해주세요.");
			int num2 = Integer.parseInt(sc.nextLine());

			//연산자 입력
			System.out.println("연산자를 입력해주세요.");
			String operator = sc.nextLine();
			
			if(num1 <0 && num2 <0) {
				System.out.println("잘못 입력했습니다.");
				continue;
			} else if (operator.equals("+")) {
				System.out.println("정답 :"+ (num1+num2));
				break;
			} else if (operator.equals("-")) {
				System.out.println("정답 :"+ (num1-num2));
				break;
			} else if (operator.equals("*")) {
				System.out.println("정답 :"+ (num1*num2));
				break;
			} else if (operator.equals("/")) {
				System.out.println("정답 :"+ (num1/num2));
				break;
			} else if (operator.equals("%")) {
				System.out.println("정답 :"+ (num1%num2));
				break;
			} 
		}
		
		
	}
	
	private static void program5() {
		// 구구단
		for (int i = 1; i <= 9; i++) {
			System.out.println("===========");
			System.out.printf("%5d단\n",i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
			System.out.println("===========");
		}
		
	}
}
