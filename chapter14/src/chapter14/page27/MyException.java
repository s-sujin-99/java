package chapter14.page27;

public class MyException extends Exception{
	//멤변(인변, 정변, 상수, 인클, 정클, 정인터 : 6개)
	private String messege;
	
	//생성자(디생, 매생 :오버로딩, this 통일)
	public MyException() {
		this(null);
	}

	MyException(String messege) {
		super(messege);
		this.messege = messege;
	}

	//멤함 (get,set, 기능, 오버라이드 : equals, toString)
	
}
