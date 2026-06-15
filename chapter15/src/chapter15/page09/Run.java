package chapter15.page09;

import java.awt.Toolkit;

// import chapter15.page08_2.BeepThread;

public class Run {

	public static void main(String[] args) {
		// DisplayThread dth1 = new DisplayThread();
		// BeepThread bth1 = new BeepThread();

		// bth1.start();
		// dth1.start();

		// Thread th1 = new Thread() {
		// @Override
		// public void run() {
		// Toolkit tk = Toolkit.getDefaultToolkit();
		// for (int i = 0; i < 5; i++) {
		// tk.beep();
		// try {
		// Thread.sleep(1000);
		// } catch (InterruptedException e) {}
		// }

		// }

		// };

		// Thread th2 = new Thread() {
		// @Override
		// public void run() {
		// for (int i = 0; i < 5; i++) {
		// System.out.println("띵");
		// try {
		// Thread.sleep(1000);
		// } catch (InterruptedException e) {}
		// }
		// }
		// };

		// Runnable runnable1 = new BeepThread();
		// Runnable runnable2 = new DisplayThread();
		// Runnable runnable1 = new Runnable() {

		// @Override
		// public void run() {
		// Toolkit tk = Toolkit.getDefaultToolkit();
		// for (int i = 0; i < 5; i++) {
		// tk.beep();
		// try {
		// Thread.sleep(1000);
		// } catch (InterruptedException e) {}
		// }
		// }
		// };

		// Runnable runnable2 = new Runnable() {

		// @Override
		// public void run() {
		// for (int i = 0; i < 5; i++) {
		// System.out.println("띵");
		// try {
		// Thread.sleep(1000);
		// } catch (InterruptedException e) {}
		// }
		// }
		// };

		Runnable runnable1 = () -> {
			Toolkit tk = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				tk.beep();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}

		};

		Runnable runnable2 = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("띵");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		};

		Thread th01 = new Thread(runnable1);
		Thread th02 = new Thread(runnable2);

		th01.start();
		th02.start();
	}

}
