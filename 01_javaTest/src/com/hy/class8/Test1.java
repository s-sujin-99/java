package com.hy.class8;

public class Test1 {

	public static void main(String[] args) {
		// 실수 범위 체크
		//float
		float fVal = 1.00000001111f;
		System.out.printf(" float 범위 : %f\n", fVal);
		
		//double
		double dVal = 1.00000000000011111;
		System.out.printf(" double 범위 : %.14f\n", dVal);
		
		//boolean 
		boolean bVal = true;
		System.out.printf(" boolean : %b\n", bVal);
		
		//문자를 저장을 하면 메모리에는 그 문자에 해당되는 유니코드 값이 저장
		char charVal = '!';
		System.out.printf(" unicode : %x\n",(int)(charVal));
		System.out.printf(" unicode : %d\n",(int)(charVal));
		
		char charVal1 ='\uc5e0';
		System.out.println(charVal);

	}

}
