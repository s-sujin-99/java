package chapter15.page40;

// 공유 데이터
public class MyData{
	
	// 멤함
	public void abc(String threadName){
		
		for (int i = 1; i <= 3; i++) {
			System.out.printf("%s - %d초\n",threadName,i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
	public void def(String threadName) {

		for (int i = 1; i <= 3; i++) {
			System.out.printf("%s - %d번\n",threadName,i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
	public void ghi(String threadName) {

		for (int i = 1; i <= 3; i++) {
			System.out.printf("%s - %dsec\n",threadName,i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
	
	
}
