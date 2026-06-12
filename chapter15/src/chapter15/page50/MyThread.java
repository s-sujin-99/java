package chapter15.page50;

public class MyThread extends Thread{

	@Override
	public void run() {
		try {
			//일시 정지 상태 - 4초
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			//일시 정지 상태에서 interrupt 발생하면 메세지와 시간지연
			System.out.printf("****sleep() 실행중 interrupt 발생****\n");
			for (long i = 0; i < 20_000_000_000L; i++) {}
		}
	
	} // end of run
}
