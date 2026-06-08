package com.hy.class03;

import java.util.Scanner;

public class Exam04 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// 번호 선택

		while (true) {
			System.out.println("1 : 숫자 출력 \n2 : 숫자 출력2\n3 : 두정수 사이값 출력\n4 : 계단 출력\n5 : 구구단\n6 : exit");
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

		System.out.println("숫자를 입력해주세요");
		int num = Integer.parseInt(sc.nextLine());

		if (num >= 1) {
			for (int i = num; i > 0; i--) {
				System.out.printf("%d\n ", i);
			}

		} else {
			System.out.println("다시입력");
		}

	}

	private static void program2() {

		while (true) {
			// 숫자 입력
			System.out.println("숫자를 입력해주세요");
			int num = Integer.parseInt(sc.nextLine());

			if (num >= 1) {
				for (int i = num; i > 0; i--) {
					System.out.printf("%d ", i);
				}
				break;
			} else {
				System.out.println("다시입력");
				continue;
			}
		}

	}

	private static void program3() {

		while (true) {
			// 숫자를 입력 받아 사이값 출력
			System.out.println("숫자를 입력해주세요");
			int num1 = Integer.parseInt(sc.nextLine());

			System.out.println("숫자를 입력해주세요");
			int num2 = Integer.parseInt(sc.nextLine());

			int max = 0;
			int min = 0;
			if (num1 > num2) {
				max = num1;
				min = num2;
			} else if (num1 < num2) {
				max = num2;
				min = num1;
			} else {
				System.out.println("다시 입력하시오.");
				continue;
			}
			for (int i = min; i <= max; i++) {
				System.out.printf("%d ", i);
			}
			break;

		}

	}

	private static void program4() {
		// *계단식 만들고 출력
		System.out.println("숫자를 입력해주세요");
		int num = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("◭");		
			}
			System.out.println("");
		}

	}

	private static void program5() {
		// *계단식 만들고 출력
		System.out.println("숫자를 입력해주세요");
		int num = Integer.parseInt(sc.nextLine());

		for (int i = num; i >=1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("◭");
			}
			System.out.println("");
		}
	}
}
