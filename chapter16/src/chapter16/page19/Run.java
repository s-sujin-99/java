package chapter16.page19;

public class Run {

	public static void main(String[] args) {
		
		D<B> d = new D<B>(new B());
		D<C> c = new D<>(new C());
		
		d.setT(new B());
		d.setT(new C());
		c.setT(new C());
		
	}

}
