package chapter15.page08_2;

import java.awt.Toolkit;

public class Run {

	public static void main(String[] args) {
		//2번 방식
//		Runnable bth1 = new BeepThread();
//		Runnable dth1 = new DisplayThread();
//		
//		Thread th1 = new Thread(bth1);
//		Thread th2 = new Thread(dth1);
//		
//		th1.start();
//		th2.start();
		
		/*
		 * //4번 방식 Runnable th1 = new Runnable() {
		 * 
		 * @Override public void run() { Toolkit tk = Toolkit.getDefaultToolkit(); for
		 * (int i = 0; i < 5; i++) { tk.beep(); //일초동안 일시정지 try { Thread.sleep(1000); }
		 * catch (InterruptedException e) {} } } }; //end of th1
		 * 
		 * Runnable th2 = new Runnable() {
		 * 
		 * @Override public void run() { for (int i = 0; i < 5; i++) {
		 * System.out.println("띵"); //일초동안 일시정지 try { Thread.sleep(1000); } catch
		 * (InterruptedException e) {} } } }; //end of th2
		 * 
		 * Thread th3 = new Thread(th1); Thread th4 = new Thread(th2); th3.start();
		 * th4.start();
		 */
		
		// 5번방식
		Runnable th1 = () ->{
			Toolkit tk = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				tk.beep();
				//일초동안 일시정지
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
			
		};
		
		Runnable th2 = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("띵");
				//일초동안 일시정지
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
		};
		
		Thread thread1 = new Thread(th1);
		Thread thread2 = new Thread(th2);

		thread1.start();
		thread2.start();
	}
}
