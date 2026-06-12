package chapter15.page48;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		//사용자 정의 스레드 2개 생성
		//모두 메인이 죽으면 끝낸다
		//사용자가 스레드 이름 부여
		//사용자가 yield 설정
		MyThread myThread1 = new MyThread();
		myThread1.setName("Thread1");
		myThread1.setDaemon(true);
		myThread1.yieldFlag = false;
		myThread1.start();
		
		MyThread myThread2 = new MyThread();
		myThread2.setName("Thread2");
		myThread2.setDaemon(true);
		myThread2.yieldFlag = true;
		myThread2.start();
		
		
		//메인 스레드에서 6회 동안 1초마다 양보 
		for (int i = 0; i < 6; i++) {
			myThread1.yieldFlag = !myThread1.yieldFlag;
			myThread2.yieldFlag = !myThread2.yieldFlag;
			Thread.sleep(1000);
		}
		
		System.out.println("Main Thread end");
	}
}
