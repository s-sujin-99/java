package chapter15.page51;

public class MyThread1 extends Thread{

	@Override
	public void run() {
		
		for (long i = 0; i < Long.MAX_VALUE; i++) {}
	
	} // end of run
}
