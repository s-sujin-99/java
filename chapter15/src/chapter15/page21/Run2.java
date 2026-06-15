package chapter15.page21;

public class Run2 {
	//메인 스레드
	public static void main(String[] args){
		//현재 스레드(메인) 객체를 가져온다.
		Thread mainThread = Thread.currentThread();
		System.out.printf("현재(메인) 스레드 이름 확인 : %s\n", mainThread.getName());
		
		mainThread.setName("ssj");
		System.out.printf("현재(메인) 스레드 이름 확인 : %s\n", mainThread.getName());
		
		//스레드 우선순위
		System.out.printf("현재 작동되고 있는 mainThread 우선순위 : %d\n", mainThread.getPriority());
		
		//현재 스레드 코어 수 
		System.out.printf("현재 작동되고 있는 mainThread 코어 수 : %d\n", Runtime.getRuntime().availableProcessors());
	}
}




