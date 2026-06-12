package chapter15.page50;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		//내가 만든 스레드 작동 
		MyThread myThread1 = new MyThread();
		Thread thread = new Thread(myThread1);
		thread.start();

		// thread sleep()
		Thread.sleep(100);
		System.out.printf("My Thread State : %s\n", thread.getState());

		// thread interrupt()
		thread.interrupt();
		Thread.sleep(100);
		System.out.printf("My Thread State : %s\n", thread.getState());
	}
}
