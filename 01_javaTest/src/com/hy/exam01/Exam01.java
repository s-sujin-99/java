package com.hy.exam01;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {

		for (; true;) {
			// 1 ~6번 문제주제와 선택번호를 보여준다.
			System.out.println(" 1 : 계산기\n 2 : 제곱승\n 3 : 개인정보출력\n 4 : exit");

			// 번호 선택
			Scanner sc = new Scanner(System.in);
			int no = sc.nextInt();

			// switch case문
			switch (no) {
			case 1:
				praricel1();
				break;
			case 2:
				praricel2();
				break;
			case 3:
				praricel3();
				break;

			default:
				System.out.println("번호를 제대로 입력해주세요.");
				break;
			}
			// no 1,2,3 아니면 종료
			if (no >= 1 && no <= 3) {
				continue;
			} else {
				break;
			}
		}

	}

	private static void praricel3() {
		// TODO Auto-generated method stub

	}

	private static void praricel2() {
		// TODO Auto-generated method stub

	}

	private static void praricel1() {
		// 계산기

	}

}
