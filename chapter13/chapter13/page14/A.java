package chapter13.page14;

public class A {
	
	C b = new B();
	
	void abc() {
		b.bcd();
	}
	class B implements C{
		@Override
		public void bcd() {
			// TODO Auto-generated method stub
			System.out.println("인스턴스 이너 클래스");
		}
	}
}
