package chapter15.page51;

// 멤버 변수 -> Mythread1를 가지고있다. -> MyThread1과 MyThread2 협업관계
public class MyThread2 extends Thread{
	
	public MyThread1 myThread1 = new MyThread1();
	
	public MyThread2(MyThread1 myThread1) {
		this.myThread1 = myThread1;
	}
	
	@Override
	public void run() {
		try {
			//myThread1이 요청하면 MyThread2가 3초동안 일시정지 - 3초
			myThread1.join(3000);
		} catch (InterruptedException e) {
			//일시 정지 상태에서 interrupt 발생하면 메세지와 시간지연
			System.out.printf("****join() 실행중 interrupt 발생****\n");
		}
		for (long i = 0; i < Long.MAX_VALUE; i++) {}
	
	} // end of run
}
