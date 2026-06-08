package chapter10.page25;

public class Run {

	public static void main(String[] args) {
		A a1 = new A();
		a1.print();
		
		B b1 = new B();
		b1.print();

		System.out.printf("%s\n","*".repeat(10));
		A a2 = new B();
		a2.print();
	
	}

}
