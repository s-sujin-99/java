package chapter16.page21;

public class Run {

	public static void main(String[] args) {
		MyInterface myInterface1 = new MyClass();
		GenericMethod genericMethod = new GenericMethod();
		genericMethod.<MyInterface>method1(myInterface1);
		
		genericMethod.<MyInterface>method1(new MyInterface() {
			
			@Override
			public void print() {
				System.out.println("오버라이딩된 함수2 입니다.");
			}
		});
			
	}

}
