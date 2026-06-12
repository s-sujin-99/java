package chapter15.page40;

public class Run {

	public static void main(String[] args) {
		// 공유객체
		MyData data = new MyData();
		// 3개의 스레드 생성
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				data.abc("thread1");

			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				data.def("thread2");

			}
		});
		
		Thread thread3 = new Thread(new Runnable() {

			@Override
			public void run() {
				data.ghi("thread3");

			}
		});
		thread1.start();
		thread2.start();
		thread3.start();
		
		

	}
}
