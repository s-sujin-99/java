package test.singleton;

// SingleTon (3가지 - 생성자, 멤버 변수(정적), 멤버 함수(정적))
public class SingleTon {
	private static SingleTon singleTon;
	
	private SingleTon() {
		System.out.println("생성자");
	}

	public static SingleTon getSingleTon() {
		
		if(singleTon == null) {
			singleTon = new SingleTon();
		}
		
		return singleTon;
	}
	
	public void print() {
		System.out.println("싱글톤 내부 함수");
	}
	
	public String name(String name) {
		return name;
	}
}
