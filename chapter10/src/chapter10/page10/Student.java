package chapter10.page10;

public class Student extends Human{
	int studentId;
	

	Student(int studentId,String name, int age){
		super(name, age);
		this.studentId = studentId;
	}
	
	public void goToSchool() {
		System.out.printf("%d번인 %s이가 학교에 갑니다.(%d살)\n",studentId,this.getName(),this.getAge());
	}
}
