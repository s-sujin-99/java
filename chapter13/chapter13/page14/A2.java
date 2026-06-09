package chapter13.page14;

public class A2 {
	
	C b = new C() {
		
		@Override
		public void bcd() {
			// TODO Auto-generated method stub
			System.out.println("이너 클래스2");
		}
	};
	
	void abc() {
		b.bcd();
	}

}
