package chapter10.page10;

public class Worker extends Human{
	int workerId;


	Worker(int workerId, String name, int age) {
		super(name, age);
		this.workerId = workerId;
	}
	
	public void goToWork() {
		System.out.printf("%d사번인 %s이가 회사를 갑니다.(%d살)\n",workerId, this.getName(), this.getAge());
	}
}
