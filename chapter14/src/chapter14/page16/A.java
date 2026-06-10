package chapter14.page16;

import java.util.Scanner;

public class A implements AutoCloseable{

	//멤버 변수
	private String name;
	private Scanner sc;
	
	//생성자
	A() {
		this(null);
	}

	A(String name) {
		super();
		name = new String(name);
		this.sc = new Scanner(System.in);
	}

	public void inputName() throws Exception {
		System.out.println("이름을 입력해주세요");
		this.name = sc.nextLine();
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public void close() throws Exception {
		 if (sc != null) {
			sc.close();
		}
		 System.out.println("자동으로 sc.close()됨");
	}

}
