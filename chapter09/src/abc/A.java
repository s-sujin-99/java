package abc;

public class A {
	public int a;
	protected int b;
	int c;
	private int d;

	public void print() {
		System.out.printf("a : %d\n", a);
		System.out.printf("b : %d\n", b);
		System.out.printf("c : %d\n", c);
		System.out.printf("d : %d\n", d);
	}
}

class B {

	public void print() {
		A a1 = new A();
		System.out.println("===========");
		System.out.printf("a : %d\n", a1.a);
		System.out.printf("b : %d\n", a1.b);
		System.out.printf("c : %d\n", a1.c);
//		System.out.printf("d : %d\n", a1.d);
	}
}