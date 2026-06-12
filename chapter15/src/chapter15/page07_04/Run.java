package chapter15.page07_04;

import java.awt.Toolkit;

public class Run {
	// 메인 스레드
	public static void main(String[] args){
		// 두가지 동시에 일을 진행
		// 사운드 기능을 작동(1초 마다 사운드 발생 *5번)
		// 숫자 기능을 작동(1초 마다 1부터 5까지 출력)
		// 임시 객체를 만들어서 바로 실행후 제거.
		// 람다식 표현  -> 제일 많이 사용
		
		Thread thread = new Thread(() -> { 
			for (int i = 0; i < 5; i++) {
				System.out.println((i+1)+"번 : 띵");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
		});
		
		Thread thread2 = new Thread(()-> {
			Toolkit tk = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				tk.beep();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
		});
		thread.start();
		thread2.start();
		
		System.out.println("main - The end");
		
	}
}
