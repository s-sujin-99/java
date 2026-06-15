package chapter15.page21;

public class Run {
	//메인 스레드
	public static void main(String[] args){
		// 두가지 동시에 일을 진행
		// 사운드 기능을 작동(1초 마다 사운드 발생 *5번)
		// 숫자 기능을 작동(1초 마다 1부터 5까지 출력)
		
		PrintNumber02 pn2 = new PrintNumber02(); 
		Thread thread = new Thread(pn2);
		thread.setName("띵 소리 출력 스레드");
		ToolkitThread02 tk2 = new ToolkitThread02();
		Thread thread2 = new Thread(tk2);
		thread2.setName("띵 소리 나는 스레드");
		
		
		thread.start();
		thread2.start();
		//현재 작동되고 있는 스레드 수
		System.out.printf("현재 작동되고 있는 스레드 수 : %d\n",Thread.activeCount());
		
		//현재 작동되고 있는 스레드 이름 
		System.out.printf("현재 작동되고 있는 thread1 이름 : %s\n",thread.getName());
		System.out.printf("현재 작동되고 있는 thread2 이름 : %s\n",thread2.getName());
		//스레드 우선순위
		System.out.printf("현재 작동되고 있는 thread1 우선순위 : %d\n", thread.getPriority());
		System.out.printf("현재 작동되고 있는 thread2 우선순위 : %d\n", thread2.getPriority());
				
		System.out.println("main - The end");
	}
}




