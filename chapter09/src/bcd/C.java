package bcd;

import abc.A;

public class C{
	public void print() {
		A a1 = new A();
		a1.a = 10;
//		a1.b = 10;
//		a1.c = 10;
		a1.print();
		
	}
}

class D extends A {
	int num;
	public D() {
		this.num = a;
		//상속하여 b 사용
		this.num = b;
//		this.num = c;
//		this.num = d;
	}
	
	public void print() {
		A a1 = new A();
		a1.a = 10;
	}
	
}
