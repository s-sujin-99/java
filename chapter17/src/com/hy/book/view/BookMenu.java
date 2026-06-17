package com.hy.book.view;

import java.util.List;

import com.hy.book.controller.BookController;
import com.hy.book.model.vo.Book;
import com.hy.book.run.Run;

public class BookMenu {
	private BookController bookController;
	
	public BookMenu() {
		bookController = new BookController();
	}

	public void bookInfoDisplay() {
		boolean exitBtn = false;
		while (!exitBtn) {
			System.out.println("1. ﻿도서 정보 출력\n2. ﻿﻿대여 통계 출력\n3. ﻿도서 등급 판별\n4. ﻿도서정렬\n5. ﻿도서검색\n6. 도서 순위 판별\n7. HOME");
			int no = Integer.parseInt(Run.sc.nextLine());
			switch (no) {
			case 1:
				System.out.println("﻿========== 도서 정보 출력 ==========");
				printBooks();
				break;
				
			case 2:
				System.out.println("﻿﻿========== 대여 통계 출력 ==========");
				avgRentCount();
				break;
				
			case 3:
				System.out.println("﻿========== 도서 등급 판별 ==========");
				famousBook();
				break;
				
			case 4:
				System.out.println("﻿========== 도서 정렬 출력 ==========");
				sortedBookList();
				break;
				
			case 5:
				searchBook();
				System.out.println("﻿========== 도서 검색 판별 ==========");
				break;

			case 6:
				rankBooks();
				System.out.println("﻿========== 도서 순위 판별 ==========");
				break;

			case 7:
				System.out.println("프로그램 종료");
				exitBtn = true;
				break;
				
			default:
				System.out.println("다시 입력해주세요.");
				break;
			}
			
		}
		
		
	}



	private void printBooks() {
		List<Book> book = bookController.printBooks();
		for (Book book2 : book) {
			System.out.println(book2);
		}
	}



	private void avgRentCount() {
		double[] book = bookController.avgRentCount();
		System.out.printf("전체 도서 대여 횟수 합계 : %.0f\n전체 도서 대여 횟수 평균 : %.2f\n",book[0],book[1]);
	}



	private void famousBook() {
		List<Book> book = bookController.printBooks();
		String[] famousBook = bookController.famousBook();
		
		for (int i = 0; i < book.size(); i++) {
			System.out.printf("%s는 %s입니다.\n", book.get(i).getTitle(), famousBook[i]);
		}
		
	}



	private void sortedBookList() {
		List<Book> book = bookController.sortedBookList();
		for (Book book2 : book) {
			System.out.println(book2);
		}
		
	}



	private void searchBook() {
		System.out.println("찾고싶은 책을 검색해주세요.");
		String name = Run.sc.nextLine();
		String findBook = bookController.searchBook(name);
		System.out.println(findBook);
	}
	

	private void rankBooks() {
		List<Book> book = bookController.printBooks();
		List<Integer> ranks = bookController.rankBooks();
		for (int i = 0; i < book.size(); i++) {
			System.out.printf("%s는 %d 이므로 %d위\n",book.get(i).getTitle(),book.get(i).getRentCount(),ranks.get(i));
		}
		
	}

}
