package chapter15.page59;

public class DataBox {
	// 멤변 (인변, 정변, 상수, 내이클, 내정클, 내인스)
//	private boolean isEmpty = true;
	private String breadState;
	
	//생성자(디생, 매생, this, super)
	public DataBox(String breadState) {
		super();
		this.breadState = null;
	}

	
	//멤함 (겟, 셋, 기능, 오버라이딩(hashCode, equals, toString))
	public synchronized String getBreadState() {
		if (this.breadState == null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
//		isEmpty = true;
		System.out.printf("%s을 장바구니에서 뺍니다.\n", breadState);
		this.breadState = null;
		notify();
		return breadState;
	}
	
	public synchronized void setBreadState(String breadState) {
		//빵이 비어있지 않으면 기달리기
		if (this.breadState != null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
//		isEmpty = false;
		this.breadState = breadState;
		System.out.printf("%s이 장바구니에 담겼습니다.\n",breadState);
		// 다른 스레드가 일할수있게 wait 상태를 깨워준다. notify()
		notify();
	}
	
	
	
	
}
