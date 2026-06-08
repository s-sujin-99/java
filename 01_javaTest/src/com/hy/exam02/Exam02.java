package com.hy.exam02;

import java.util.Scanner;

public class Exam02 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {


		// 번호 선택

		while (true) {
			System.out.println(
					"1 : 양수 출력 \n2 : 양수,음수,0 구분 출력\n3 : 홀짝 출력\n4 : 사탕 나누기 출력\n5 : 성별 출력\n6 : 연령대 출력\n7 : 합격 출력\n8 : 민증으로 성별출력\n9 : 같은 정수 찾기\n10 : 연봉\n11 : exit");
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
				program6();
				break;
			case 7:
				program7();
				break;
			case 8:
				program8();
				break;
			case 9:
				program9();
				break;
			case 10:
				program10();
				break;

			default:

				break;
			}
			
			if (no >= 1 && no <= 10) {
				continue;
			} else {
				System.out.println("번호가 없습니다.");
				break;
			}
		}

	}

	private static void program1() {
		// 양수
		System.out.println("숫자를 입력해주세요");
		int num = Integer.parseInt(sc.nextLine());

		if (num >= 0) {
			System.out.printf("%d는 양수입니다.\n", num);
		} else {
			System.out.printf("%d는 음수입니다.\n", num);
		}
	}

	private static void program2() {
		// 양수 아니면 음수, 0이면 0이다
		System.out.println("숫자를 입력해주세요");
		int num = Integer.parseInt(sc.nextLine());

		if (num > 0) {
			System.out.printf("%d는 양수입니다.\n", num);
		} else if (num < 0) {
			System.out.printf("%d는 음수입니다.\n", num);
		} else {
			System.out.printf("%d는 0입니다.\n", num);
		}
	}

	private static void program3() {
		// 홀짝
		System.out.println("숫자를 입력해주세요");
		int num = Integer.parseInt(sc.nextLine());

		if (num % 2 == 0) {
			System.out.printf("%d는 짝수입니다.\n", num);
		} else {
			System.out.printf("%d는 홀수입니다.\n", num);
		}
	}

	private static void program4() {
		// 사탕 나누어 갖기
		System.out.println("인원수를 입력해주세요.");
		int num = Integer.parseInt(sc.nextLine());
		// 사탕 개수 입력
		System.out.println("사탕 수를 입력해주세요.");
		int candy = Integer.parseInt(sc.nextLine());

		int avgCandy = candy / num;
		int namCandy = candy % num;
		System.out.println("===============");
		System.out.printf("인원수 : %d\n사탕 개수 : %d\n1인당 사탕 개수 : %d\n남는 사탕 개수 : %d\n", num, candy, avgCandy, namCandy);
		System.out.println("===============");

	}

	private static void program5() {
		// 성별 출력

		// 이름
		System.out.println("이름를 입력해주세요.");
		String name = sc.nextLine();

		// 학년
		System.out.println("학년을 입력해주세요.");
		int level = Integer.parseInt(sc.nextLine());

		// 반
		System.out.println("반을 입력해주세요.");
		int userClass = Integer.parseInt(sc.nextLine());

		// 번호
		System.out.println("번호를 입력해주세요.");
		int id = Integer.parseInt(sc.nextLine());

		// 성별
		System.out.println("성별를 입력해주세요.");
		String gender = sc.nextLine();
		if (gender.equals("M")) {
			gender = "남학생";
		} else if (gender.equals("F")) {
			gender = "여학생";
		} else {
			System.out.println("성별이 없다.");
		}

		// 성적
		System.out.println("성적를 입력해주세요.");
		double score = Double.parseDouble(sc.nextLine());

		System.out.println("==================");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("학년 : %d\n", level);
		System.out.printf("반 : %d\n", userClass);
		System.out.printf("번호 : %d\n", id);
		System.out.printf("성별 : %s\n", gender);
		System.out.printf("성적 : %.2f\n", score);
		System.out.println("==================");

	}

	private static void program6() {
		// 연령대 13세 이하 : 어린이 13 ~ 19세 : 청소년 19 ~ 세 : 성인
		// 나이
		System.out.println("나이를 입력해주세요");
		int age = Integer.parseInt(sc.nextLine());
		
		if (age <= 13) {
			System.out.printf("나이 : %d\n어린이\n", age);
		} else if (13 < age && age < 20) {
			System.out.printf("나이 : %d\n청소년\n", age);
		} else {
			System.out.printf("나이 : %d\n성인\n", age);
		}

	}

	private static void program7() {
		// 국영수 평균이 40이상 60이상 합격
		// 국어
		System.out.println("국어 점수를 입력해주세요");
		int kor = Integer.parseInt(sc.nextLine());
		// 영어
		System.out.println("영어 점수를 입력해주세요");
		int eng = Integer.parseInt(sc.nextLine());
		// 수학
		System.out.println("수학 점수를 입력해주세요");
		int math = Integer.parseInt(sc.nextLine());

		int sum = kor + eng + math;
		double avg = (double) (sum) / 3;

		String result = "";
		if (kor >= 40 && eng >= 40 && math >= 40) {
			if (avg >= 60) {
				result = "합격";
			} else {
				result = "불합격";
			}
		} else {
			result = "불합격";
		}

		System.out.println("================");
		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", math);
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.1f\n", avg);
		System.out.printf("%s\n", result);
		System.out.println("================");
	}

	private static void program8() {
		// 민증으로 성별
		// 민증 입력
		System.out.println("주민번호를 입력해주세요(- 포함)");
		String userId = sc.nextLine();
		String genderId = userId.charAt(7) + "";
		String gender = "";
		if (genderId.equals("2")) {
			gender = "여자";
		} else if (genderId.equals("1")) {
			gender = "남자";
		}

		System.out.println("=================");
		System.out.printf("%s : %s", userId, gender);
		System.out.println("=================");

	}

	private static void program9() {
		// 3개 정수 받고 모두 같은면 true, 아니면 false
		// 정수1
		System.out.println("숫자를 입력해주세요");
		int num1 = Integer.parseInt(sc.nextLine());
		// 정수2
		System.out.println("숫자를 입력해주세요");
		int num2 = Integer.parseInt(sc.nextLine());
		// 정수3
		System.out.println("숫자를 입력해주세요");
		int num3 = Integer.parseInt(sc.nextLine());
		boolean check = true;

		if (num1 == num2 && num1 == num3 && num2 == num3 && num2 == num1) {
			check = true;
		} else {
			check = false;
		}

		System.out.println("================");
		System.out.printf("num1 : %d\nnum2 : %d\nnum3 : %d\n%b\n", num1, num2, num3, check);
		System.out.println("================");

	}

	private static void program10() {
		// 연봉+인센 계산후 3000이상 미만 출력
		// 연봉1
		System.out.println("연봉를 입력해주세요");
		String num = sc.nextLine();

		
		
	}
}
