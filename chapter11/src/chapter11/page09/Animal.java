package chapter11.page09;

// 부모객체는 new 불가능(불완전해서 jdk가 반려) : 반드시 멤버함수 한개 이상 추상메소드가 있어야한다.
// 일반클래스 : 9가지
public abstract class Animal extends Object{
	//멤변
	private int price;
	private String name;
	
	// 디생
	Animal() {
		this(0,null);
	}
	
	// 멤생
	Animal(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	//멤버 함수 ( get,set, 기능, 츨력 / toString, hashCode, 추상 메소드(abstract) : 오버라이딩, 오버로딩)
	public abstract void cry();

}