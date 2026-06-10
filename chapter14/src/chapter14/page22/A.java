package chapter14.page22;

public class A {
	//멤버 변수
	
	//생성자 
	public A() {}
	
	//멤버 함수
	public void abc() throws InterruptedException{
		bcd();
	}

	public void bcd() {
		// 반복문 실행 중 0.5초 잠시 동안 멈추기
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
