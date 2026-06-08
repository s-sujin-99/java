package chaper06.page10;

import java.util.Scanner;

public class CarMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] carArr = new Car[1];
		for (int i = 0; i < carArr.length; i++) {
			System.out.println("자동차 색깔 : ");
			String color = sc.nextLine();
			System.out.println("자동차 가격 : ");
			int price = Integer.parseInt(sc.nextLine());
			System.out.println("자동차 제조연도 : ");
			int mfg = Integer.parseInt(sc.nextLine());
			System.out.println("자동차 이름 : ");
			String name = sc.nextLine();

			carArr[i] = new Car(color, price, mfg, name);
		}

		// 등록한 객체에 멤버변수값 수정 *비추 -> 캡슐화정책
//		carArr[0].color = "파란색";
		carArr[0].setColor("회색");

		for (int i = 0; i < carArr.length; i++) {
			carArr[i].drive();
		}

		for (int i = 0; i < carArr.length; i++) {
			carArr[i].carPrint();
			System.out.printf("%s \n",carArr[i].toString());
		}

		// 첫번째 차의 색상을 출력
		System.out.printf("첫번째 차 색상 %s\n",carArr[0].getColor());

		carArr[0].end();
	}

}
