package chapter15.page47;

public class Run {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.printf("main Thread state : %s\n", mainThread.getState());
		
		//사용자가 정의한 Thread 생성
		Thread thread = new Thread(() -> {
			//1부터 100억까지 카운트하는 반복문
			for (long i = 0; i < 100_000_000_00L; i++) {
				
			}
			
		});
		
		//1. new 상태도 점검
		System.out.printf("Thread state : %s\n", thread.getState());
		//2. thread start() 상태도 점검
		thread.start();
		System.out.printf("Thread state : %s\n", thread.getState());
		//3. thread 종료상태 점검 (메인 스레드에게 thread가 종료될때까지 기달려달라고 요청)
		try {
			thread.join();
		} catch (InterruptedException e) {}
		System.out.printf("Thread state : %s\n", thread.getState());
		
		System.out.println("main Thread end");
		System.out.printf("final main Thread state : %s\n", mainThread.getState());
		
	}
}
