package com.hy.a_basic;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {
		// 두개 정수 받고 합 차 곱 나누기 한 몫과 나머지 출력
		Scanner sc = new Scanner(System.in);
		
		//숫자1
		System.out.println("정수를 입력해주세요 : ");
		int num1 = sc.nextInt();
		
		//숫자2
		System.out.println("정수를 입력해주세요 : ");
		int num2 = sc.nextInt();
		
		int add = num1 +num2;
		int ma = num1 -num2;
		int goh = num1 *num2;
		int na1 = num1 /num2;
		int na2 = num1 %num2;
		
		System.out.println("==================");
		System.out.printf("더하기 : %d \n",add);
		System.out.printf("빼기 : %d \n",ma);
		System.out.printf("곱하기 : %d \n",goh);
		System.out.printf("몫 : %d \n",na1);
		System.out.printf("나머지 : %d \n",na2);
		System.out.println("==================");

	}

}
