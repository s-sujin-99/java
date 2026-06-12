package chapter15.page48;

public class MyThread extends Thread{
	public boolean exitFlag = false;
	public boolean yieldFlag = false;
	
	@Override
	public void run() {
		// 무한루프을 돌면서 조건에 따가 yield 상태일때와 Runnable 상태일 때 testing
		int number = 0;
		while (!exitFlag) {
			//조건을 걸어 상태 변환
			if (yieldFlag) {
				Thread.yield();
			} else {
				if (number <=2 ) {
					System.out.printf("%s 실행중\n", this.getName());
					for (long i = 0; i < 1_000_000L; i++) {}
					number++;

				}
			}
		} 
		
	} // end of run
}
