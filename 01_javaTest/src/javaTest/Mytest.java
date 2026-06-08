package javaTest;

import java.util.Scanner;

//클래스 시작
public class Mytest {
	
	//자바코드 시작
	public static void main(String[] args) {
		// alert, confirm, prompt => 문자열
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 나이는? : ");
		
		int age = sc.nextInt();
		System.out.printf("나이는 %d살 입니다.", age);


	}

}
