package chapter10.page53;

public class A {
	//맴변
	int a;

	A() {
		this(0);
		System.out.println("A 생성자1");
	}

	//맴생
	A(int a) {
		this.a = a;
		System.out.println("A 생성자2");
	}

	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
	

}
