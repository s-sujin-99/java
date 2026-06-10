package chapter14.page01;

public class Exception3 {
	
	public static void main(String[] args) {
		// unchecked NullPointerException
		String str = "abcdef";
		
		try {
			System.out.println(str.charAt(2));
		} catch (Exception e) {
			System.out.printf("에러 내용 : %s\n",e.getMessage());
			
		} finally {
			// 자원 해제
			System.out.println("프로그램 종료");
		}
	}
}
