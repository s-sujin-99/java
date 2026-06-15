package chapter15.page32;

// 공유 데이터
public class MyData{
	// 멤변(6가지)
	private int data;

	// 생상자 (4가지)
	public MyData() {
		this(0);
	}
	MyData(int date) {
		super();
		this.data = date;
	}

	// 멤함
	public int getDate() {
		return data;
	}
	public void setDate(int date) {
		this.data = date;
	}
	
	// 기능 -> 자기 멤버변수에 1씩 더하는 함수
	public synchronized void plusDate(){
		// 값을 비교해 안전하게 보관
		synchronized (this) {
			int bufferData = this.data;
			
			// 2초 동안 멈추기 -> 100% context switching 발생(thread1, thread2 교차)
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
			this.data = bufferData + 1;
		}
	}
	
	
}
