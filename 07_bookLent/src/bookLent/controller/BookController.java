package bookLent.controller;

import bookLent.model.vo.Book;

public class BookController {
	private Book[] bArr;

	//객체 생성
	public BookController() {
		bArr = new Book[5];
		bArr[0] = new Book("자바의 정석", "it", 45);
		bArr[1] = new Book("혼공 C언어", "it", 15);
		bArr[2] = new Book("피프티 피플", "소설", 50);
		bArr[3] = new Book("꿈 백화점", "소설", 35);
		bArr[4] = new Book("삼국지", "역사", 10);
	}
	// 도서 정보 출력
	public Book[] printBook() {
		return bArr;
	}
	
	// rentCount 합계
	public int sumRentCount() {
		int sum = 0;
		for(int i = 0; i <bArr.length; i++) {
			sum += bArr[i].getRentCount();
		}
		return sum;
	}
	//총계와 평균값
	public double[] avgRentCount() {
		double[] sumAndAvg = new double[2];
		sumAndAvg[0] = (double)sumRentCount();
		sumAndAvg[1] = sumRentCount() /bArr.length;
		
		return sumAndAvg;
	}
	
	// 도서 대여 카운트중심으로 내림차순으로 정렬
	public Book[] rentCountSort() {
		
		for (int i = 0; i < bArr.length - 1; i++) {
			for (int j = i; j < bArr.length; j++) {
				if (bArr[i].getRentCount() < bArr[j].getRentCount()) {
					Book buffer = bArr[i];
					bArr[i] = bArr[j];
					bArr[j] = buffer;
				}
			}
		}
		return bArr;
	}
	
}
