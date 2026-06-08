package chapter05.pracitice05;

import java.util.Arrays;
import java.util.Scanner;

public class Exam05Test {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.printf("1,2,3,4,5,6,7,8:종료");
			System.out.printf(">>");
			int no = Integer.parseInt(scan.nextLine());
			switch (no) {
			case 1:
				practice1();
				break;
			case 2:
				practice2();

				break;
			case 3:
				practice3();

				break;
			case 4:
				practice4();

				break;
			case 5:
				practice5();

				break;
			case 6:
				practice6();

				break;
			case 7:
				practice7();

				break;
			default:
				System.out.printf("졸려...");
				break;
			}
			if (no == 8) {
				System.out.printf("프로그램 종료");
				break;

			}
		}

		if (scan != null) {
			scan.close();
		}

	}

	private static void practice7() {
		int[] lotto = new int[7];

		for (int i = 0; i < lotto.length; i++) {
			int num = (int) (Math.random() * (45 - 1 + 1) + 1);
			// 1)flag값을 설정을 한다.
			// 2)반복문을 돌려서 중복체크해서 문제가 없으면 그대로 진행한다.,
			// 3)반복문을 중복이되면 flag값을 true저장하고 반복문을 빠져나간다.
			// 4)조건문을 걸어서 flag 확인해서 true이면 (i--) 다시진행(continue)
			// 5)조건문을 확인해서 flag가 false이면 lotto[i] = num 진행한다.

			boolean findflag = false;
			for (int j = 0; j < lotto.length; j++) {
				if (num == lotto[i]) {
					findflag = false;
					break;
				}
			}

			if (findflag == true) {
				i = i - i;
				continue;
			}

			lotto[i] = num;

		}

		for (int i = 0; i < lotto.length - 1; i++) {
			System.out.printf("%-3d", lotto[i]);
		}
		System.out.printf("보너스 번호: %-3d", lotto[6]);
		System.out.println();

	}

	private static void practice6() {
		int[] no = new int[10];
		for (int i = 0; i < no.length; i++) {
			no[i] = (int) (Math.random() * (10 - 1 + 1) + 1);
		}
		for (int i = 0; i < no.length; i++) {
			System.out.printf("%-3d", no[i]);
		}

		System.out.println();

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < no.length; i++) {
			if (no[i] > max) {
				max = no[i];
			}
			if (no[i] < min) {
				min = no[i];
			}
		}
		System.out.printf("%s의 최대값은 %d \n %s의 최소값은 %d", Arrays.toString(no), max, Arrays.toString(no), min);
		System.out.println();
	}

	private static void practice5() {
		int[] no = new int[10];
		for (int i = 0; i < no.length; i++) {
			no[i] = (int) (Math.random() * (10 - 1 + 1) + 1);
		}
		for (int i = 0; i < no.length; i++) {
			System.out.printf("%-3d", no[i]);
		}
		System.out.println();

	}

	private static void practice4() {
		int no = 0;
		String[] str1 = new String[] { "월", "화", "수", "목", "금", "토", "일" };
		while (true) {
			System.out.printf("0부터 6까지 숫자를 입력하세요");
			no = Integer.parseInt(scan.nextLine());
			if (no >= 0 && no <= 6) {
				break;
			} else {
				System.out.println("정신 차려!");
			}

		}
		System.out.printf("%5s", str1[no]);
		System.out.println();

	}

	private static void practice3() {
		int no = 0;
		while (true) {
			System.out.printf("정수를 입력하세요");
			no = Integer.parseInt(scan.nextLine());
			if (no > 1) {
				break;
			} else {
				System.out.println("정신 차려!");
			}
		}
		int[] a = new int[no];
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%5d", a[i]);
		}
		System.out.println();
	}

	private static void practice2() {
		int[] intArray2 = new int[10];

		for (int i = 0; i < intArray2.length; i++) {
			intArray2[i] = 10 - i;
		}
		for (int i = 0; i < intArray2.length; i++) {
			System.out.printf("%5d", intArray2[i]);
		}
		System.out.println();
	}

	private static void practice1() {
		int[] intArray = new int[10];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1;
		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.printf("%5d", intArray[i]);
		}
		System.out.println();

	}

}
