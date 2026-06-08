package chapter10.page53;

public class B extends A{
	public B() {
		this(3);
		System.out.println("B 생성자1");
	}
	public B(int a) {
		this.a = a;
		System.out.println("B 생성자2");
	}
}
