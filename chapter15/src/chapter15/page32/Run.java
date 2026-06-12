package chapter15.page32;

public class Run {
	
	public static void main(String[] args){
		// 공유 객체 생성
		MyData data = new MyData(3);

		// thread1을 만들고 진행
		PlusThread plusThread1 = new PlusThread(data);
		plusThread1.setName("thread1");
		plusThread1.start();
		// thread2을 만들고 진행
		PlusThread plusThread2 = new PlusThread(data);
		plusThread2.setName("thread2");
		plusThread2.start();
		
		
	}
}




