package chapter16.page12;

public class GenericMethod {
	//멤버함수(겟, 셋, 기능, 오버라이딩(hashCode, equals, toString))
	public <T> T method1 (T t) {
		return t;
	}
	
	//리턴 x , 매개변수값 2개
	public <T, K> void method2(T t, K k) {
		System.out.print(t.toString()+"\t");
		System.out.print(k.toString());
	}
}
