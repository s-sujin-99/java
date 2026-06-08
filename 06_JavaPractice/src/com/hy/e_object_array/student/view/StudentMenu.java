package com.hy.e_object_array.student.view;

import com.hy.e_object_array.student.controller.StudentController;
import com.hy.e_object_array.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm;
	
	public StudentMenu() {
		ssm = new StudentController();
		
		//학생 정보 출력
		Student[] studentArr = ssm.printStudent();
		for (int i = 0; i < studentArr.length; i++) {
			System.out.printf("%d번 %s \n",i+1, studentArr[i]);
		}
		//학생 성적 출력
		double[] avgArr =  ssm.avgScore();
		System.out.printf("5명의 학생의 총점 : %f\n", avgArr[0]);
		System.out.printf("5명의 학생의 평균 : %f\n", avgArr[1]);
		
		//성적 결과 출력
		for (int i = 0; i < studentArr.length ; i++) {
			String isPass = (studentArr[i].getScore() > ssm.CUT_LINE) ? "합격" : "불합격";
			System.out.printf("%s학생은 %s 입니다.\n",studentArr[i].getName(),isPass);
			
		}
			
	}
}
