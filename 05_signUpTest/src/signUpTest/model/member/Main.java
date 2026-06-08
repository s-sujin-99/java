package signUpTest.model.member;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Member[] m1 = new Member[3];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean exitBtn = false;
		while (!exitBtn) {
			System.out.println("1. 회원등록\n2. 전화번호 변경\n3. recipe\n4. exit");
			int no = Integer.parseInt(sc.nextLine());
			switch (no) {
			case 1:
				signUp();
				break;
			case 2:
				changePhone();
				break;
			case 3:
				
				break;
			case 4:
				System.out.println("프로그램 종료");
				exitBtn = true;
				break;

			default:
				System.out.println("다시 입력해주세요.");
				break;
			}
		}
		
		
		if(sc != null) {
			System.out.println("시스템 종료");
			sc.close();
		}
		
	}
	
	private static void signUp() {
		// 회원등록
		
		
		for (int i = 0; i < m1.length; i++) {
			m1[i] = new Member();
			System.out.print("id을 입력해주세요");
			String id = sc.nextLine();
			m1[i].setId(id);
			System.out.print("비밀번호을 입력해주세요");
			String password = sc.nextLine();
			m1[i].setPassword(password);
			System.out.print("이름을 입력해주세요");
			String name = sc.nextLine();
			m1[i].setName(name);
			System.out.print("전화번호를 입력해주세요");
			String phone = sc.nextLine();
			m1[i].setPhoneNum(phone);
		}
		
		for (int i = 0; i < m1.length; i++) {
			System.out.println(m1[i].toString());
		}
		
//		Member m1 = new Member("sujin18", "123456789", "sujin", "010-1234-5678");
//		System.out.println(m1.toString());
//		m1.changePhoNumber("010-3456-7890"); 
//		System.out.println(m1.toString());
//		
		
		
	}
	
	private static void changePhone() {
		// 번호 변경

//		boolean exitBtn = false;
//		while(!exitBtn) {
//			System.out.print("아이디를 입력해주세요");
//			String equalsName = sc.nextLine();
//			
//			if(!equalsName.equals(Main.m1.getId())) {
//				System.out.print("변경할 번호를 입력해주세요");
//				String newPhone = sc.nextLine();
//				
//				m1.changePhoNumber(newPhone);
//				System.out.println("변경 완료");
//				exitBtn = true;
//			}
//			
//			System.out.println("아이디가 틀립니다.");
//		}
//		
		
	}

}
