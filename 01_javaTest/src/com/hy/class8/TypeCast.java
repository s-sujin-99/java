package com.hy.class8;

public class TypeCast {

	public static void main(String[] args) {
		// 강제 형변환(수동)
		int iValue = (int)34.45f;
		// 자동 형변환(값을 잃어버리지 x)
		double dValue = (double) 34.45f;
		
		short sValue = 5+4;
		
		int iValue2 = (int) 'a';
		
		//boolean 강제 형변환 x 
		boolean boolValue = Boolean.parseBoolean("true");
		
		

	}

}
