package chapter09.page15;

public class Run {

	public static void main(String[] args) {
		// 동적 정적 멤버 변수
		A a1 = new A();
		A a2 = new A();
		
		a1.a = 5;
		a2.a = 6;
		System.out.printf("a1.a : %d\na2.a : %d\n",a1.a, a2.a);
		
		a1.b = 7;
		a2.b = 8;
		System.out.printf("a1.b : %d\na2.b : %d\n", a1.b, a2.b);
		
		//정적멤버 변수는 클래스명.정적멤버변수
		A.b = 9;
		System.out.printf("A.b : %d",A.b);
	}

}
