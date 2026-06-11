package chapter15.page07;

public class Run {
	//메인 스레드
	public static void main(String[] args) throws InterruptedException{
		// 두가지 동시에 일을 진행
		// 사운드 기능을 작동(1초 마다 사운드 발생 *5번)
		// 숫자 기능을 작동(1초 마다 1부터 5까지 출력)
		
		printNumber pn = new printNumber(); 
		ToolkitThread tk = new ToolkitThread();
	

		// 데몬 스레드 -> main이 죽으면 종료
		pn.setDaemon(true);
		// 독립 스레드
		pn.start();
//		tk.start();

		Thread.sleep(2000);
		System.out.println("main - The end");
	}
}




