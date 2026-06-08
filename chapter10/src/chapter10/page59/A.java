package chapter10.page59;

public class A {
	//맴변
	private int age;
	private String name;
	
	//생성자
	A() {
		this(0,null);
	}
	
	A(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	//멤버 함수 get, set
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//출력
	@Override
	public String toString() {
		return "A [age=" + age + ", name=" + name + "]";
	}
	
	public boolean equals(Object obj) {
		//1. instanceof 상속확인
		if (!(obj instanceof A)) {
			System.out.println("비교 대상이 아닙니다.");
			return false;
		}
		
		//2. 다운캐스팅
		A a = (A)obj;
		
		//3. this객체와 a 객체를 비교한다.
		if(this.age == a.age && this.name.equals(a.name)) {
			return true;
		}
		
		return false;
	}
}
