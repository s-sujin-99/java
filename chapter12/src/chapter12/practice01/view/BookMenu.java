package chapter12.practice01.view;

import chapter12.practice01.Run;
import chapter12.practice01.controller.BookController;
import chapter12.practice01.model.BookInfo;

public class BookMenu {
	private BookController bc;
	
	public BookMenu() {
		bc = new BookController();
	}
	
	public void bookInfoDisplay() {
		boolean exitBtn = false;
		
		while (!exitBtn) {
			System.out.println("1. 책정보 출력\n2. 대여수 순위 정렬\n3. 총 대여수 출력\n4. 대여수와 평균 출력\n5. HOME");
			System.out.println(">>");
			int no = Integer.parseInt(Run.sc.nextLine());

			switch (no) {
			case 1:
				printBook();
				break;
			case 2:
				rentCountSort();
				break;
			case 3:
				sumRentCount();
				break;
			case 4:
				AvgRentCount();
				break;
			case 5:
				System.out.println("종료합니다.");
				exitBtn = true;
				break;

			default:
				System.out.println("다시 선택해주세요.");
				break;
			}
		}
	}


	//정보 출력
	public void printBook() {
		BookInfo[] bArr = bc.bookController();
		for (BookInfo bookInfo : bArr) {
			System.out.println(bookInfo.toString());
		}
	}
	
	//정보 대여수 순위로 정렬 출력
	public void rentCountSort() {
		BookInfo[] bArr = bc.rentCountSort();
		for (int i = 0; i < bArr.length; i++) {
			 System.out.println(bArr[i].toString());
			
		}
	}
	
	//책정보에서 총 대여수 출력
	public void sumRentCount() {
		System.out.printf("책정보 총 대여수 : %d\n", bc.sumRentCount());
	}
	
	//책정보에서 총 대여수와 평균 출력
	private void AvgRentCount() {
		double[] sumAvgArr = bc.avgRentCount();
		System.out.printf("책정보 총 대여수 : %5.0f, 책정보 평균 : %5.2f\n",sumAvgArr[0],sumAvgArr[1]);
		
	}
	
}
