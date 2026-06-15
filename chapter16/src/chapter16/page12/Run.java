package chapter16.page12;

public class Run {

	public static void main(String[] args) {
		GenericMethod genericMethod1 = new GenericMethod();
		String s1 = genericMethod1.method1("홍길동");
		int i1 = genericMethod1.method1(100);
		double d1 = genericMethod1.method1(23.4);
		
		System.out.printf("String : %s\n", s1);
		System.out.printf("int : %d\n", i1);
		System.out.printf("double : %.1f\n", d1);
	
		genericMethod1.method2("홍길동", 60);
	}

}
