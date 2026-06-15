package chapter15.page24;

public class Run {
	
	public static void main(String[] args){
		// MyThread를 10개로 만들고 일을 시킴
		Thread[] threads = new Thread[10];
	
		for (int i = 0; i < 10; i++) {
			threads[i] = new MyThread();
			threads[i].setName("thread" + (i+1));
			
			// 마지막 스레드를 우선을 끝내고 싶을때
			if (i == 9) {
				threads[i].setPriority(Thread.MAX_PRIORITY);
			} else {
				threads[i].setPriority(Thread.NORM_PRIORITY);
			}
			
			threads[i].start();
		}
		
		System.out.println("main Thread - The end");
	}
}




