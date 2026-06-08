package chapter10.page29;

public class House extends Boob {
	int m = 4;
	static int sm = 4;
	public void boob() {
		System.out.println("집이 불타 무너집니다.");
	}
	
	public static void sBoob() {
		System.out.println("집이 터집니다.-> 정적멤버함수");
	}

}
