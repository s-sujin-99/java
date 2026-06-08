package chapter12.page21;

// 부모객체는 new 불가능(불완전해서 jdk가 반려) : 반드시 멤버함수 한개 이상 추상메소드가 있어야한다.
// 일반클래스 : 9가지
	public interface Animal {
	//멤변
	 public static final int PRICE = 0;
	
	//멤버 함수 ( get,set, 기능, 츨력 / toString, hashCode, 추상 메소드(abstract) : 오버라이딩, 오버로딩)
	public abstract void cry();

}