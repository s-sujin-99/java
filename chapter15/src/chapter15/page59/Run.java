package chapter15.page59;

public class Run {

	public static void main(String[] args){
		// 두개 Thread 생성 - 3번
		// 첫 스레드는 빵을 한개씩 만들어서 DataBox에 집어 넣는다(10번)
		// 두번째 스레드는 빵이 있으면 DataBox에 가져온다(10번)
		
		//공유객체
		DataBox box = new DataBox(null);
		
		// 스레드 1번
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					box.setBreadState((i+1) + "번째 빵");
				}
			}
		}; //end of thread1
		
		// 스레드 2번
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					box.getBreadState();
				}
			}
		};
		thread1.start();
		thread2.start();
	}

}
