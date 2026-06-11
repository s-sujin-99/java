package chapter12.practice01.controller;

import chapter12.practice01.model.BookInfo;

public class BookController {
	private BookInfo[] bookInfo;
	public static final int CUT_LINE;
	public static final int BOOK_COUNT;

	static {
		CUT_LINE = 30;
		BOOK_COUNT = 5;
	}

	public BookInfo[] BookController() {
		bookInfo = new BookInfo[5];
		bookInfo[0] = new BookInfo("자바의 정석", "IT", 45);
		bookInfo[1] = new BookInfo("혼공 C언어", "IT", 15);
		bookInfo[2] = new BookInfo("피프티 피플", "소설", 55);
		bookInfo[3] = new BookInfo("꿈 백화점", "소설", 35);
		bookInfo[4] = new BookInfo("삼국지", "역사", 10);

		return bookInfo;
	}

	public BookInfo[] printBook() {
		return bookInfo;
	}

	public int sumRentCount() {
		int sum = 0;
		for (BookInfo bookInfo2 : bookInfo) {
			sum += bookInfo2.getRentCount();
		}

		return sum;
	}

	public double[] avgRentCount() {
		double[] sumAvgArr = new double[2];
		sumAvgArr[0] = sumRentCount();
		sumAvgArr[1] = sumAvgArr[0] / BOOK_COUNT;

		return sumAvgArr;
	}

	// 도서 대여 카운트중심으로 내림차순으로 정렬
	public BookInfo[] rentCountSort() {

		for (int i = 0; i < bookInfo.length - 1; i++) {
			for (int j = i; j < bookInfo.length; j++) {
				if (bookInfo[i].getRentCount() < bookInfo[j].getRentCount()) {
					BookInfo buffer = bookInfo[i];
					bookInfo[i] = bookInfo[j];
					bookInfo[j] = buffer;
				}
			}
		}
		return bookInfo;
	}

}
