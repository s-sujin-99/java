package chapter15.page21;

public class Run2 {
	//메인 스레드
	public static void main(String[] args){
		//현재 스레드(메인) 객체를 가져온다.
		Thread mainThread = Thread.currentThread();
		System.out.printf("현재(메인) 스레드 이름 확인 : %s\n", mainThread.getName());
		
		mainThread.setName("ssj");
		System.out.printf("현재(메인) 스레드 이름 확인 : %s\n", mainThread.getName());
		
	}
}




