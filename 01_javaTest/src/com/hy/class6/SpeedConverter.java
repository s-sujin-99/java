package com.hy.class6;

import java.util.Scanner;

public class SpeedConverter {
	
	public static void main(String[] args) {
		//시속을 입력받아 초속으로 변환하여 출력 
		//m/s = km/h*(1000/3600)
		
		Scanner sc = new Scanner(System.in);
		
		//시속 입력
		System.out.println("시속을 입력해 주세요 : ");
		int kmHour = sc.nextInt();
		double num = 3.6;
		
		//초속으로 변환
		double mSecond = kmHour / num;
		
		System.out.println("=============");
		System.out.printf("%d의 초속은 %.0f입니다 \n", kmHour, mSecond);
		System.out.println("=============");
		
	}

}
