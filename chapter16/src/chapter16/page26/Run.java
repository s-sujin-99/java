package chapter16.page26;

public class Run {

	public static void main(String[] args) {
		// 부모
		Parent<String> parent = new Parent<String>("홍길동");
		parent.setT(new String("제우스"));
		System.out.println(parent.getT());
		
		//자식
		Child< String, Integer> child = new Child("홍길동", 10);
//		child.setT("java");
		System.out.printf("이름 : %s \n나이 : %d", child.getT(), child.getV());
	}

}
