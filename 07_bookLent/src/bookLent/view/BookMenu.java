package bookLent.view;

import bookLent.controller.BookController;
import bookLent.model.vo.Book;
import bookLent.run.Run;

public class BookMenu {
	private BookController bookController;

	public BookMenu() {
		
	}
	public void bookMenu() {
		boolean retrunMenu = false;
		while (!retrunMenu) {
			bookController = new BookController();
			Book[] bookInfo = bookController.printBook();

			System.out.println("============== 메뉴 ==============");
			System.out.println("1. 도서정보출력\n2. 대여통계출력\n3. 도서등급판별\n4. 도서정보정렬\n5. 메인 화면");
			int no = Integer.parseInt(Run.sc.nextLine());
			switch (no) {
			case 1: {
				System.out.println("========== 도서 정보 출력 ==========");
				for (int i = 0; i < bookInfo.length; i++) {
					System.out.printf("%s\n", bookInfo[i]);
				}

			}
				break;
			case 2: {

				System.out.println("========== 대여 통계 출력 ==========");
				double[] avgBook = bookController.avgRentCount();
				System.out.printf("전체 도서 대여 횟수 합계 : %.0f\n", avgBook[0]);
				System.out.printf("전체 도서 대여 횟수 평균 : %.1f\n", avgBook[1]);
			}

				break;
			case 3: {

				System.out.println("========== 도서 등급 출력 ==========");
				for (int i = 0; i < bookInfo.length; i++) {
					if (bookInfo[i].getRentCount() > 30) {
						System.out.printf("%s 도서는 인기도서 입니다.\n", bookInfo[i].getTitle());
					} else {
						System.out.printf("%s 도서는 일반도서 입니다.\n", bookInfo[i].getTitle());
					}
				}
			}

				break;
			case 4: {
				System.out.println("========== 도서 정보 정렬 ==========");
				
				bookInfo = bookController.rentCountSort();
				for (Book book : bookInfo) {
					System.out.println(book.toString());
				}
				
//				for (int i = 0; i < bookInfo.length; i++) {
//					bookInfo = bookController.rentCountSort();
//					System.out.printf("%d - %s\n", bookInfo[i].getRentCount(), bookInfo[i].getTitle());
//				}

			}
				break;
			case 5: {
				System.out.println("========== 도서 정보 종료 ==========");
				retrunMenu = true;

			}
				break;

			default:
				System.out.println("다시 입력해주세요");
				break;
			}
		}

	}
}
