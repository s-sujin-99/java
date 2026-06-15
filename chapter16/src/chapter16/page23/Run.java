package chapter16.page23;

public class Run {

	public static void main(String[] args) {
		// 객체 생성
		Test test1 = new Test();

		// A 하위는 안된다.
		test1.method1(new Goods<A>(new A()));
//		test1.method1(new Goods<B>(new B()));
//		test1.method1(new Goods<C>(new C())));
//		test1.method1(new Goods<D>(new D())));

		// 다 가져올수 있다.
		test1.method2(new Goods<A>(new A()));
		test1.method2(new Goods<B>(new B()));
		test1.method2(new Goods<C>(new C()));
		test1.method2(new Goods<D>(new D()));
		
		// B 상위는 안된다.
//		test1.method3(new Goods<A>(new A()));
		test1.method3(new Goods<B>(new B()));
		test1.method3(new Goods<C>(new C()));
		test1.method3(new Goods<D>(new D()));
		
		// B 하위는 안된다.
		test1.method4(new Goods<A>(new A()));
		test1.method4(new Goods<B>(new B()));
//		test1.method4(new Goods<C>(new C()));
//		test1.method4(new Goods<D>(new D()));
	}

}
