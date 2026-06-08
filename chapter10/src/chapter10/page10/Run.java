package chapter10.page10;

public class Run {

	public static void main(String[] args) {
//		Human stu1 = new Human();
//		stu1.name = "홍길동";
//		stu1.age = 16;
//		stu1.eat();
//		stu1.sleep();
//		
		
		//자식 객체 만들기
		Student stu2 = new Student(4,"김민성",15);
		System.out.printf("[studentId=%d, name=%s, age=%d]\n",
				stu2.studentId,stu2.getName(),stu2.getAge());
		stu2.eat();
		stu2.sleep();
		stu2.goToSchool();
		
		System.out.println("");
		
		Worker wor1 = new Worker(126, "김현지", 30);
		System.out.printf("[workerId=%d, name=%s, age=%d]\n",
				wor1.workerId,wor1.getName(),wor1.getAge());
		wor1.eat();
		wor1.sleep();
		wor1.goToWork();

	}

}
