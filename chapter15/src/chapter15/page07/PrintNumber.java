package chapter15.page07;

public class PrintNumber extends Thread{
	
	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println((i+1)+"번 : 띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
//		System.out.println("숫자 - The end");
	}
	
}
