package chapter07.page09;

import java.util.Scanner;

public class RunBook {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean exitBtn = false;

		while (!exitBtn) {
			System.out.println("1. 도서명 입력\n2. exit");
			int no = Integer.parseInt(sc.nextLine());
			switch (no) {
			case 1:
				BookInput();
				break;
			case 2:
				System.out.println("종료합니다.");
				exitBtn = true;
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

	private static void BookInput() {
		BookClass[] book1 = new BookClass[3];
		
		
		for (int i = 0; i < book1.length; i++) {
			
			book1[i] = new BookClass();
			System.out.println("도서를 입력해주세요");
			book1[i].setTitle(sc.nextLine());
			System.out.println("출판사를 입력해주세요");
			book1[i].setPublicher(sc.nextLine());
			System.out.println("저자를 입력해주세요");
			book1[i].setAuthor(sc.nextLine());
			System.out.println("가격을 입력해주세요");
			book1[i].setPrice(Integer.parseInt(sc.nextLine()));
			System.out.println("할인율을 입력해주세요");
			book1[i].setDiscountRate(Double.parseDouble(sc.nextLine()));
			
		}
			
		for (int i = 0; i < book1.length; i++) {
			System.out.println(book1[i].toString());
			
		}
		
	}


}
