package chapter07.practice08;

import java.util.Scanner;

public class ZooMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean exitBtn = false;

		while (!exitBtn) {
			System.out.println("\n1. 동물원\n2. 동물원 배열 출력\n3. member\n4. exit");
			System.out.println("번호를 선택해주세요.");
			int no = Integer.parseInt(sc.nextLine());
			switch (no) {
			case 1:
				Program1();
				break;
			case 2:
				Program2();
				break;
			case 3:
				Program3();
				break;
			case 4:
				System.out.println("종료합니다.");
				exitBtn = true;
				break;

			default:
				System.out.println("다시 선택해주세요.");
				break;
			}
		}

		if (sc != null) {
			sc.close();
		}
		System.out.println("The end.");

	}

	private static void Program1() {
		// 동물원 프로그램
		// 동물원 이름, 위치
		Zoo zoo = new Zoo("우리 동물원", "경기도 성남");

		// 동물 이름
		boolean exitBtn = false;
		while (!exitBtn) {
			int animalCount = zoo.getAnimalCount();
			if (animalCount >= 5) {
				System.out.println("동물이 들어갈 공간이 부족합니다.");
				exitBtn = true;
			} else {
				System.out.println("동물을 추가해주세요.");
				String animalName = sc.nextLine();
				animalCount = zoo.addAnimal(animalName);
			}
		}

		// 출력
		System.out.println(zoo.toString());

	}

	private static void Program2() {
		// 동물원 배열 출력
		Zoo[] zoo1 = new Zoo[3];
		
		//사이즈 있으면 무한루프x
		for (int i = 0; i < zoo1.length; i++) {
			zoo1[i] = new Zoo();
			System.out.print("동물원 이름\n");
			zoo1[i].setName(sc.nextLine());
			System.out.print("동물원 위치\n");
			zoo1[i].setLocation(sc.nextLine());
			
			// 동물 이름
			boolean exitBtn = false;
			while (!exitBtn) {
				int animalCount = zoo1[i].getAnimalCount();
				if (animalCount >= 5) {
					System.out.println("동물이 들어갈 공간이 부족합니다.\n");
					exitBtn = true;
				} else {
					System.out.println("동물을 추가해주세요.\n");
					String animalName = sc.nextLine();
					animalCount = zoo1[i].addAnimal(animalName);
				}
			}

			System.err.printf("\n%d번째 동물원 완료\n",i+1);
		} //end of for
		
		for (int i = 0; i < zoo1.length; i++) {			
			System.err.printf("%d번째 동물원 완료 \n%s",i+1, zoo1[i].toString());
			
		}

	}

	private static void Program3() {
		// TODO Auto-generated method stub

	}

}
