package chaper07Test.practice;

import java.util.Scanner;

import com.hy.object.practice1.model.vo.Book1;
import com.hy.object.practice1.model.vo.Product;
public class Practice {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean exitCheck = false;
		while (!exitCheck) {
			System.out.println("1. 핸드폰 정보 출력\n2. 도서 정보 출력\n3. exit");
			int no = Integer.parseInt(sc.nextLine());
			switch (no) {
			case 1:
				Practice1();
				break;
			case 2:
				Practice2();
				break;
			case 3:
				exitCheck = true;
				System.out.println("종료합니다.");
				break;

			default:
				System.out.println("다시 입력해주세요.");
				break;
			}
		}

	}

	private static void Practice1() {
		// 핸드폰 정보 출력
		Product proList1 = new Product("아이폰16", 1000000, "애플");
		Product proList2 = new Product("갤럭시 s25", 1350000, "삼성");

		proList1.infomation();
		proList2.infomation();
		
	}

	private static void Practice2() {
		// 책정보 출력
		Book1 book1 = new Book1();
		Book1 book2 = new Book1();
		Book1 book3 = new Book1();
		
		book1.setTitle("객체지향의 사실과 오해");
		book2.setTitle("클린 코드");
		book3.setTitle("실용주의 프로그래머");
		
		book1.setAuthor("조영호");
		book2.setAuthor("로버트 C. 마틴");
		book3.setAuthor("앤드류 헌트, 데이비드 토마스");
		
		book1.setPublisher("위키북스");
		book2.setPublisher("인사이트");
		book3.setPublisher("인사이트");
		
		book1.setPrice(25000);
		book2.setPrice(38000);
		book3.setPrice(35000);
		
		book1.setDiscountRate(0.1);
		book2.setDiscountRate(0.15);
		book3.setDiscountRate(0.1);
		
		book1.inform();
		book2.inform();
		book3.inform();
		
	}



}
