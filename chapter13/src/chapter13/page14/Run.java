package chapter13.page14;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = new C() {
			
			@Override
			public void bcd() {
				// TODO Auto-generated method stub
				System.out.println("이너 클래스4");
			}
		};
		c1.bcd();
		
	}

}
