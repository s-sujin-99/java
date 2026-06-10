package chapter14.page01;

import java.util.Scanner;

public class Exception1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double value = 0.0;
		boolean condition = false;
		while (!condition) {
			System.out.println("`0`은 넣지 말아주세요.");
			int num = Integer.parseInt(sc.nextLine());
			try {
				System.out.println("100문장 실행");
				value = 10 / num;
				condition = true;
				System.out.println("200문장 실행");
			} catch (Exception e) {
				System.out.print("에러 이유 : ");
				e.printStackTrace();
			}

		}
		if (sc != null) {
			sc.close();
		}

		System.out.println(value);
		System.out.println("The end");

	}

}
