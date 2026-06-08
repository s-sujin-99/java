package chaper06.page00.student;

import java.util.Scanner;

public class Test2Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// 직사각형 면적을 구하는 프로그램
		// 가로 세로 입력 받고 면적을 구해서 출력하는 프로그램
		Test2[] test1 = new Test2[3];
		for (int i = 0; i < test1.length; i++) {
			System.out.println("폭을 입력하세요.");
			int width = Integer.parseInt(sc.nextLine());
			System.out.println("높이를 입력하세요.");
			int height = Integer.parseInt(sc.nextLine());
			test1[i] = new Test2(width,height);
		}
		
		for (int i = 0; i < test1.length; i++) {
			test1[i].areaCalculate();
		}
		
		for (int i = 0; i < test1.length; i++) {
			test1[i].areaPrint();
		}

		
		if (sc != null) {
			sc.close();
		}
	}

}
