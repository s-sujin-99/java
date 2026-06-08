package chapter09.page18;

public class A {
	//멤버 변수
	private int a;		 //인스턴스 멤버변수
	public static int b; //클레스 멤버변수

	//생성자 -> new 객체 생성할때 실행
	//정적 멤버변수 초기화(정적블록영역) -> class가 로더가 될때 실행
	A() {
		super();
		
	}
	
	A(int a) {
		this.a = a;
	}
	
	static {
		b = 10;
		System.out.printf("A 클래스 정적블록 초기화 진행이 했습니다. %d\n",A.b);
	}

	//멤버 함수 (인함, 정함:기능, 겟셋터, 출력, 오버로딩:시그니처)
	public void abc() {
		this.a = 30;
		A.b = 30;
		A.bcd();
	}
	
	
	public static void bcd() {
//		this.a = 40;
		A.b = 40;
//		abc();
	}
	
	
}
