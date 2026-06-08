package com.hy.class8;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// 문자열을 받아서 한개씩 출력
		Scanner sc = new Scanner(System.in);
		
		//상수
		final double PI = 3.14;
		
		//bit 변수로 데이터 저장 (-128 ~127)
		byte byteCValue = 127;
		System.out.printf("byteValue : %d", (byte) (byteCValue+1));
		
//		// 문자열 받기
//		System.out.println("원하는 문자열을 입력하시오");
//		String content = sc.nextLine();
//		
//		System.out.printf("입력한 문자열 : %s\n", content);
//		for (int i = 0; i < content.length(); i++) {
//			System.out.println(content.charAt(i));
//		}
//		
//		//정수값을 10진수, 8진ㅅ, 16진수 2진수로 보여줘
//		System.out.println("정수 : ");
//		int num = sc.nextInt();
//		System.out.printf(" 10진법 : %d\n 8진법 : %o\n 16진법 : %x\n 2진법 : %s\n",num,num,num, Integer.toBinaryString(num));
//		
		//자원 반납
		if (sc != null) {
			sc.close();
		}
		
	}

}
