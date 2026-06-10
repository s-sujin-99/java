package chapter14.page13;

import java.io.InputStreamReader;

public class Exception2 {

	public static void main(String[] args) {
		
		try (InputStreamReader isr = new InputStreamReader(System.in)) {

			System.out.println("값을 입력해주세요.");
			char charValue = (char) isr.read();
			System.out.printf("키보드로 받은 문자열 : %s\n", charValue);
		} catch (Exception e) {
			System.out.println("에러 발생");
			e.printStackTrace();
		}
		
		System.out.println("The end");
	}

}
