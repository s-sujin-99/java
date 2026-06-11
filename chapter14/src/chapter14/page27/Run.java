package chapter14.page27;

public class Run {
	public static void main(String[] args) {
		//1. 사용자로 부터 정수값 입력
		//2. 사용자가 입력한 값이 0-100까지 정상 출력
		// 그렇지 않으면 내가 만든 예외처리 진행
		int no = 50;
		
		try {
			if (no < 0 || no > 100) {
				//예외
				throw new MyException("0부터 100사이 숫자만 입력해주세요.");
			} else {
				System.out.printf("%d : 정상작동",no);
			}
		} catch (MyException e) {
			e.printStackTrace();
		}
		
	}
}
