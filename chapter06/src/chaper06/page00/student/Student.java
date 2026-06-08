package chaper06.page00.student;

// 분산되어 있는 학생 정보를 관리한다
public class Student {
	//멤버 변수
	String name;
	int kor;
	int eng;
	int math;
	int total;
	
	//매개변수가 있는 생성자 =>매개변수가 없으면 디폴트 생성자
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//멤버 함수
	void totalCalculate() {
		total = kor + eng + math;
	}
	
	//멤버 함수
	void studentPrint() {
		System.out.printf("%-10s %-5d %-5d %-5d %-5d\n",name, kor, eng, math, total);
	}
}
