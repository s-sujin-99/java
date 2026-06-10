package chapter14.page13;


import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Exception1 {
	
	public static void main(String[] args) {
		//키보드, 파일, 네트워크전송 -> 1byte 입력 -> 2byte char로 변형 값을 읽겠다.
		InputStreamReader isr = null;
		char[] buffer = new char[10];
		// System.in -> 키보드로 하는 장치
		isr = new InputStreamReader(System.in);
		try {
			System.out.println("값을 입력해주세요.");
			char charValue = (char)isr.read();
			System.out.printf("키보드로 받은 문자열 : %s",charValue);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("에러 발생");
			e.printStackTrace();
		} finally {
			if (isr != null) {
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		

	}

}
