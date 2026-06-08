package chaper06.page00.student;

import java.util.Scanner;

public class StudentMain {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//세명의 정보를 받아서 출력
//		Student sd1 = new Student("가가", 90, 90, 90);
//		Student sd2 = new Student("나나", 80, 80, 80);
//		Student sd3 = new Student("다다", 70, 70, 70);
//		//총점
//		sd1.totalCalculate();
//		sd2.totalCalculate();
//		sd3.totalCalculate();
//		
//		//출력
//		sd1.studentPrint();
//		sd2.studentPrint();
//		sd3.studentPrint();
		
		//Student 객체 배열 선언
		Student[] stuArray = new Student[3];
		for (int i = 0; i < stuArray.length; i++) {
			stuArray[i] = new Student("ssu"+(i+1),100,100,100);
			
		}
		//총점
		for (int i = 0; i < stuArray.length; i++) {
			stuArray[i].totalCalculate();
		}
		
		//출력
		for (int i = 0; i < stuArray.length; i++) {
			stuArray[i].studentPrint();
			
		}
		
	}

}
