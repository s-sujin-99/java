package chapter15.page08;

import java.awt.Toolkit;

public class BeepThread extends Thread{
	@Override
	public void run() {
		// 소리를 울리는 객체
		Toolkit tk = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			tk.beep();
			//일초동안 일시정지
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
