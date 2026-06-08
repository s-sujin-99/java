package SnackTest.model;

import java.util.Scanner;

public class Practice {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean exitCheck = false;
		while (!exitCheck) {
			System.out.println("1. 간식 등록\n2. exit");
			int no = Integer.parseInt(sc.nextLine());
			switch (no) {
			case 1:
				Practice1();
				break;
			case 2:
				exitCheck = true;
				System.out.println("종료합니다.");
				break;

			default:
				System.out.println("다시 입력해주세요.");
				break;
			}
		}
		if (sc != null) {
			System.out.println("시스템 종료");
			sc.close();
		}

	}

	private static void Practice1() {
		int addCount = 3;
		Snack[] snackList = new Snack[addCount];
		for (int i = 0; i < snackList.length; i++) {
			snackList[i] = new Snack();

			System.out.println("간식를 입력해주세요");
			snackList[i].setName(sc.nextLine());
			System.out.println("맛를 입력해주세요");
			snackList[i].setFlavor(sc.nextLine());
		}

		for (int i = 0; i < snackList.length; i++) {
			System.out.printf("%s\n", snackList[i].toString());

		}
		
		System.out.println("가장 좋아하는 과자를 고르시오.");
		int no = Integer.parseInt(sc.nextLine());
		switch (no) {
		case 1:
			snackList[no-1].eatSnack();
			break;
		case 2:
			snackList[no-1].eatSnack();
			break;
		case 3:
			snackList[no-1].eatSnack();
			break;

		default:
			System.out.println("다시 선택하시오");
			break;
		}

	}

}
