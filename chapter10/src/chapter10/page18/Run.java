package chapter10.page18;

public class Run {
	public static void main(String[] args) {
		B b = new B(3, 4);
		System.out.println(b.m);
		System.out.println(b.n);
		b.abc();
		b.bcd();
		System.out.printf("%s\n","*".repeat(20));
		
		//downCasting 하는 과정
		//부모 주소 저장
		A a = new B(3,4);
//		A a1 = new A(10);
		//다운 캐스팅
		if( a instanceof B) {			
			//downCasting 
			B b1 = (B)a;
			System.out.println(a.m);
//		System.out.println(a.n); 	//    ->  안됨
			System.out.println(b1.n);
			a.abc();
			b1.bcd();
		} else {
			System.out.println("부모 객체 번지에는 자식 객체 영역이 없다.");
		}
		
		
		
	}
}
