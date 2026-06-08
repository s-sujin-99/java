package chapter10.page11;

public class Run {

	public static void main(String[] args) {
		// 부모 객체 참조 변수 = 모든 자식의 주소를 저장
		// 자식의 번지영역에서 부모영역만 있으면 업캐스팅이 가능
		A a1 = new B(); 	// -> upCasting
		A a2 = new C();
		A a3 = new D();
		
		B b1 = new C();
		B b2 = new D();
//		B b3 = new A();
		B b4 = (B)a1;  		// -> downCastion
		
	}

}
