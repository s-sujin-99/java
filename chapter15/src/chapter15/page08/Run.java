package chapter15.page08;

import java.awt.Toolkit;

public class Run {

	public static void main(String[] args) {
		// 1번 방식
		//BeepThread bth1 = new BeepThread();
		//DisplayThread dth1 = new DisplayThread();
		//bth1.start();
		//dth1.start();
		
		// 2번 방식
		Thread th1 = new Thread() {
			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("띵");
					//일초동안 일시정지
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
			}
		}; // end of th1
		
		Thread th2 = new Thread() {
			
			@Override
			public void run() {
				Toolkit tk = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					tk.beep();
					//일초동안 일시정지
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
			}
		};	// end of th2
		
		th1.start();
		th2.start();
	}

}
