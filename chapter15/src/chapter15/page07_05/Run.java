package chapter15.page07_05;

import java.awt.Toolkit;

public class Run {
	// 메인 스레드
	public static void main(String[] args){
		// 3번 방식으로 Thread 임시객체 구현
		// 1초마다 비프음을 울리는 스레드
		// 1초마다 띵 출력하는 스레드
		
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				Toolkit tk = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					tk.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
			}
		}; // end of thread1
		
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println((i+1)+"번 : 띵");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
			}
		}; // end of thread2
		
		thread1.start();
		thread2.start();
		
		System.out.println("The end");
		
	}
}
