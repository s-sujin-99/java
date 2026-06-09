package chapter13.page16;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		A a = new A() {
			
			@Override
			public void abc() {
				// TODO Auto-generated method stub
				System.out.println("익명 이너 클래스");
			}
		};
		c.cde(a);
		c.cde(new A() {
			
			@Override
			public void abc() {
				// TODO Auto-generated method stub
				System.out.println("익명 이너 클래스2");
			}
		});
		
	}

}
