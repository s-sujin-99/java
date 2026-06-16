package chapter12.practice02;

import java.util.Scanner;

import chapter12.practice02.view.BookMenu;

public class Run {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		boolean exitBtn = false;
		while (!exitBtn) {
			System.out.println("1. 도서\n2. 도서 판매\n3. 회원관리\n4. 게시판\n5. 관리자\n6.HOME");
			System.out.println(">>");
			int no = Integer.parseInt(sc.nextLine());

			switch (no) {
			case 1:
				BookMenu menu = new BookMenu();
				menu.DisplayMenu();
				break;
			case 2:
				System.out.println("서비스 준비중");
				break;
			case 3:
				System.out.println("서비스 준비중");
				break;
			case 4:
				System.out.println("서비스 준비중");
				break;
			case 5:
				System.out.println("서비스 준비중");
				break;
			case 6:
				exitBtn = true;
				break;

			default:
				System.out.println("다시 입력해주세요.");
				break;
			}
		}
		
		if (Run.sc != null) {
			Run.sc.close();
		}
	}
	

}
