package chapter07.page28;

public class A {
	//매변
	private int no;
	
	//생성자 오버로딩
	public A(){
		System.out.println("매개변수 없는 생성자");
	}

	public A(int no) {
		this();
		this.no = no;
		System.out.println("매개변수 있는 생성자");
	}
	

}
