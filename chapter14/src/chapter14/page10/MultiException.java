package chapter14.page10;

public class MultiException {

	public static void main(String[] args) {
		// 다중 예외 처리 하기 -> 잘 사용하지는 않음
		try {
			//System.out.println(2/0);
			int num = Integer.parseInt("10!");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.printf("ArithmeticException : %s",e.getMessage());
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.printf("NumberFormatException : %s",e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.printf("Exception : %s",e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("The end");
		}
		
	}

}
