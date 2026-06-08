package extendsTest.practice01;

public class Student extends Human{
	int studentID;

	Student(String name, int age, int studentID) {
		super(name, age);
		this.studentID = studentID;
	}
	
	public void goToSchool() {
		System.out.printf("%d살인 %s이가 학교에 갑니다.\n",this.getAge(),this.getName());
	}
}
