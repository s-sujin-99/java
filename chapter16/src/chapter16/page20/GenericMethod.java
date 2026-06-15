package chapter16.page20;

public class GenericMethod {
	//제네릭 메소드 타입 제한
	public <T extends String> T method1(T t) {
		// t.method() -> 10개정도 제한
		// string 메소드 쓰고 싶으면 extends String -> 제한을 걸어주면 됨
		int len = t.length();
		System.out.printf("length : %d\n",len);
		return null;
	}
}
