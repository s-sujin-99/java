package chapter15.page21;

import java.awt.Toolkit;

public class ToolkitThread02 implements Runnable{
	@Override
	public void run() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			tk.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		System.out.println("비디오 - The end");
	}
}
