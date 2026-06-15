package chapter15.page32;

public class PlusThread extends Thread{
	//멤버 변수
	private MyData myDate;
	
	//생성자 
	public PlusThread(MyData myDate) {
		this.myDate = myDate;
	}
	
	@Override
	public void run() {
		// 자기 멤변인 myDate에 plusDate() 실행
		// myDate에 data값 출력
		myDate.plusDate();
		System.out.printf("%s thread data 결과값 : %d\n", getName(), myDate.getDate());
		
	}
}
