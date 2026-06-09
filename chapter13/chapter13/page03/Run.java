package chapter13.page03;

public class Run {

	public static void main(String[] args) {
		
		A a1 = new A();
		
		A.B b = a1.new B();
		b.bcd();

	}

}
