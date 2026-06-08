package chapter10.page18;

public class B extends A {
	int n = 4;

	B(int m, int n) {
		super(m);
		this.n = n;
	}
	
	public void bcd() {
		System.out.println("B 클래스의 함수입니다.");
	}
}
