package chapter15.page51;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		//내가 만든 두개 스레드 작동 
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2(myThread1);
		myThread1.start();
		myThread2.start();
		
		// 두개의 스레드 상태값
		System.out.printf("My Thread1 State : %s\n", myThread1.getState());
		System.out.printf("My Thread2 State : %s\n", myThread2.getState());

		myThread2.interrupt();
		System.out.printf("My Thread1 State : %s\n", myThread1.getState());
		System.out.printf("My Thread2 State : %s\n", myThread2.getState());
		
		//main Thread sleep
		Thread.sleep(100);
	}
}
