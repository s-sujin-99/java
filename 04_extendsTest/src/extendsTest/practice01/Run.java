package extendsTest.practice01;

public class Run {
	public static void main(String[] ar) {
		Student stu1 = new Student("홍길동", 15, 1);
		stu1.eat();
		stu1.sleep();
		stu1.goToSchool();
		System.out.println("============");
		System.out.printf("이름 : %s\n",stu1.getName());
		System.out.printf("나이 : %d\n",stu1.getAge());
		System.out.printf("번호 : %d\n",stu1.studentID);
		System.out.println("============");
	}
}
