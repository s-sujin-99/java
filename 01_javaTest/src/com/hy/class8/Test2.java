package com.hy.class8;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		//유니코드
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 하나만 적어주세요");
		char charUser = sc.nextLine().charAt(0);
		
		System.out.printf("%s 의 유니코드 : U+%04x",charUser, (int) (charUser));
	}
}
