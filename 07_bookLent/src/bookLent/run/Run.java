package bookLent.run;

import java.util.Scanner;

import bookLent.view.BookMenu;

public class Run {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean exitBtn = false;
		while (!exitBtn) {
			System.out.println("1. 도서\n2. 판매\n3. 회원관리\n4. 관리자\n5. 게시판\n6. 종료");
			int no = Integer.parseInt(sc.nextLine());
			switch (no) {
			case 1:
				BookMenu bm = new BookMenu();
				bm.bookMenu();
				break;
				
			case 2:
				System.out.println("서비스 준비중입니다.");
				break;
				
			case 3:
				System.out.println("서비스 준비중입니다.");
				break;
				
			case 4:
				System.out.println("서비스 준비중입니다.");
				break;
				
			case 5:
				System.out.println("서비스 준비중입니다.");
				break;

			case 6:
				System.out.println("프로그램 종료");
				exitBtn = true;
				break;
				
			default:
				System.out.println("다시 입력해주세요.");
				break;
			}
			
		}
		
		if (sc != null) {
			sc.close();
		}

	}

}
