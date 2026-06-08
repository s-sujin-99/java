package com.hy.class4;

import java.util.Scanner;

public class Member {

	public static void main(String[] args) {
		// 사용자 이름과 나이와 성별을 입력 받아서 출력
		Scanner sc = new Scanner(System.in);
		//이름
		System.out.print("이름을 입력해주세요");
		String name = sc.nextLine();
		//나이
		System.out.print("나이를 입력해주세요");
		int age = sc.nextInt();
		//성별
		System.out.print("성별을 입력해주세요");
		String gender = sc.nextLine();
		
		//출력
		System.out.printf("\n 이름은 %s 이고 나이는 %d 살, 성별은 %s 입니다.", name, age, gender);

	}

}
