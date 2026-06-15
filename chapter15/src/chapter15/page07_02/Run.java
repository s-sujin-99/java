package chapter15.page07_02;

public class Run {
	//메인 스레드
	public static void main(String[] args){
		// 두가지 동시에 일을 진행
		// 사운드 기능을 작동(1초 마다 사운드 발생 *5번)
		// 숫자 기능을 작동(1초 마다 1부터 5까지 출력)
		
		PrintNumber02 pn2 = new PrintNumber02(); 
		Thread thread = new Thread(pn2);
		
		ToolkitThread02 tk2 = new ToolkitThread02();
		Thread thread2 = new Thread(tk2);
		
		
		thread.start();
		thread2.start();
		
		
		System.out.println("main - The end");
	}
}




