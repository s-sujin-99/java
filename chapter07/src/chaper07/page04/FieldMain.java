package chaper07.page04;

public class FieldMain {

	public static void main(String[] args) {
		// 객체 선언
		FieldExample ex1 = new FieldExample("냐옹","멍멍");
		
		ex1.setCat("꼬기오");
		System.out.println(ex1.getCat());
		System.out.println(ex1.getDog());
		ex1.work1();
		
	}

}
