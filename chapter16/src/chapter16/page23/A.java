package chapter16.page23;

public class A {
	
}

class B extends A {}
class C extends B {}
class D extends C {}

class Goods<T>{
	private T t;

	Goods(T t) {
		super();
		this.t = t;
	}
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}


	
}

class Test {
	void method1(Goods<A> goods) {}
	void method2(Goods<?> goods) {}
	void method3(Goods<? extends B> goods) {}
	void method4(Goods<? super B> goods) {}
}