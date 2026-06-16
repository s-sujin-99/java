package chapter12.practice02.view;

import chapter12.practice02.controller.BookController;
import chapter12.practice02.Run;
import chapter12.practice02.model.BookInfo;

public class BookMenu {
	BookController controller;
	public BookMenu() {
		controller = new BookController();
	}
	
	public void DisplayMenu() {
		boolean exitBtn = false;
		while (!exitBtn) {
			System.out.println("1. 책정보 출력\n2. 대여수 순위 정렬\n3. 인기 도서 출력\n4. 대여수와 평균 출력\n5. 검색\n6.HOME");
			System.out.println(">>");
			int no = Integer.parseInt(Run.sc.nextLine());

			switch (no) {
			case 1:
				printBook();
				break;
			case 2:
				getSortCount();
				break;
			case 3:
				getFamousBook();
				break;
			case 4:
				avgRentCount();
				break;
			case 5:
				searchBook();
				break;
			case 6:
				exitBtn = true;
				break;

			default:
				break;
			}
		}
		
	}

	private void printBook() {
		BookInfo[] book = controller.printBook();
		for (BookInfo bookInfo : book) {
			System.out.println(bookInfo.toString());
		}
	}

	private void getSortCount() {
		BookInfo[] book = controller.getSortCount();
		for (BookInfo bookInfo : book) {
			System.out.println(bookInfo.toString());
		}
		
	}

	private void getFamousBook() {
		BookInfo[] bookList = controller.printBook();
		String[] book = controller.getFamousBook();
		
		for (int i = 0; i < book.length; i++) {
			System.out.printf("%s는 %s입니다.\n",bookList[i].getTitle(),book[i]);
		}
	}

	private void avgRentCount() {
		double[] book = controller.avgRentCount();
		System.out.printf("전체 도서 대여 횟수 합계 : %.0f\n",book[0]);
		System.out.printf("전체 도서 대여 횟수 평균 : %.2f\n",book[1]);
	}

	private void searchBook() {
		// TODO Auto-generated method stub
		
		System.out.println("찾고싶은 책을 입력해주세요.");
		String name = Run.sc.nextLine();
		String findBook = controller.searchBook(name);
		
		if (findBook != null) {
			System.out.println(findBook);
		} else {
			System.out.println("찾는 책이 없습니다.");
		}
			
		
	}
}
