package com.hy.class9;

import java.util.Scanner;

public class ExemTest {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean exitFlag = false;
		while (!exitFlag) {
			// 문제 출제
			System.out.println("1. 안녕\n2. 반가워\n3. 그만\n4. 집\n5. 종료 ");
			int num = Integer.parseInt(sc.nextLine());

			switch (num) {
			case 1:
				pr1();
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:
				System.out.println("종료합니다.");
				exitFlag = true;
				break;

			default:
				System.out.println("다시 입력해주세요.");
				break;
			}
		}

	}

	private static void pr1() {
		// 정수1
		System.out.println("숫자를 입력해주세요");
		int num1 = Integer.parseInt(sc.nextLine());
		// 정수2
		System.out.println("숫자를 입력해주세요");
		int num2 = Integer.parseInt(sc.nextLine());
		
		String op = null;
		boolean exitFlog = false;
		
		while (!exitFlog) {
			// 연산자 문자, 문자열
			System.out.println("+ - / % *");
			op = String.valueOf(sc.nextLine().charAt(0));
			if(op.equals("+") || op.equals("-") || op.equals("/") || op.equals("*") || op.equals("*") ) {
				exitFlog = true;
			} else {
				System.out.println("다시 입력해주세요 (+,-,*,/,% 만)");
			}
			
		}
		switch (op) {
		case "+":
			System.out.printf("%d + %d = %d\n",num1,num2, num1+num2);
			break;
		case "-":
			System.out.printf("%d - %d = %d\n",num1,num2, num1-num2);
			break;
		case "*":
			System.out.printf("%d * %d = %d\n",num1,num2, num1*num2);
			break;
		case "/":
			System.out.printf("%d / %d = %d\n",num1,num2, num1/num2);
			break;
		case "%":
			System.out.println(num1 + "%" + num2+ "=" + num1%num2);
			break;

		default:
			break;
		}
	}

}
