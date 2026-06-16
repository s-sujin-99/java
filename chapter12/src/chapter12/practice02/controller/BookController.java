package chapter12.practice02.controller;

import chapter12.practice02.model.BookInfo;

public class BookController {
	private BookInfo[] bArr;
	private static int CUT_LINE;
	private static int COUNT;
	
	static {
		CUT_LINE = 30;
		COUNT = 5;
	}

	public BookController() {
		bArr = new BookInfo[COUNT];
		bArr[0] = new BookInfo("자바의 정석", "IT", 45);
		bArr[1] = new BookInfo("혼공 C 언어", "IT", 15);
		bArr[2] = new BookInfo("피프티 피플", "소설", 50);
		bArr[3] = new BookInfo("꿈 백화점", "소설", 35);
		bArr[4] = new BookInfo("삼국지", "역사", 10);
	}
	
	public BookInfo[] printBook() {
		return bArr;
	}
	
	public int sumRentCount() {
		int sum = 0;
		for (int i = 0; i < COUNT; i++) {
			sum += bArr[i].getRentCount();
		}
		return sum;
	}
	
	public double[] avgRentCount() {
		double[] avgList = new double[2];
		avgList[0] = this.sumRentCount();
		avgList[1] = (double) this.sumRentCount() / COUNT;
		return avgList;
	}
	
	public String[] getFamousBook() {
		String[] famousBooks = new String[bArr.length];
		for (int i = 0; i < bArr.length; i++) {
			famousBooks[i] = (bArr[i].getRentCount() > CUT_LINE) ? "인기도서" : "일반도서";
			
		}
		return famousBooks;
	}
	
	public BookInfo[] getSortCount() {
		// 초기화
		BookInfo[] cbArr = new BookInfo[COUNT];
		for (int i = 0; i < cbArr.length; i++) {
			cbArr[i] = new BookInfo(bArr[i]);
		}
		
		for (int i = 0; i < cbArr.length -1; i++) {
			for (int j = i+1; j < cbArr.length; j++) {
				if (cbArr[i].getRentCount() < cbArr[j].getRentCount()) {
					BookInfo buffer = cbArr[i];
					cbArr[i] = cbArr[j];
					cbArr[j] = buffer;
				}
				
			}
		} // end of for
		
		return cbArr;
	}
	
	public String searchBook(String name) {
		BookInfo findBook = null;
		for (int i = 0; i < bArr.length; i++) {
			if (bArr[i].getTitle().equals(name)) {
				findBook = bArr[i];
				break;
			}
		}
		return (findBook != null) ? findBook.toString() : null;
	}
}
