package com.hy.student.view;

import java.util.List;
import com.hy.student.controller.StudentController;
import com.hy.student.model.Student;
import com.hy.student.run.Run;

public class StudentMenu {
	private StudentController controller;
	
	public StudentMenu() {
		controller = new StudentController();
		addDummy();
	}

	public void mainMenu() {
		boolean exitBtn = false;
		while (!exitBtn) {
			System.out.println("\n1. ﻿﻿학생 정보 추가\n2. ﻿전체 학생 목록 출력\n3. ﻿﻿특정 학생 검색\n4. ﻿﻿특정 학생 삭제\n5. ﻿﻿특정 학생 정보 수정\n"
					+ "6. ﻿총점 내림차순 정렬 및 석차 부여\n7. 총점이 같으면 id 내림차순 정렬\n8. exit");
			int no = Integer.parseInt(Run.sc.nextLine());
			switch (no) {
			case 1:
				System.out.println("﻿========== 학생 정보 추가 ==========");
				addStudent();
				break;
			case 2:
				System.out.println("﻿﻿========== 전체 학생 목록 출력 ==========");
				printAll();
				break;
			case 3:
				System.out.println("﻿========== 특정 학생 검색 ==========");
				searchStudent();
				break;
			case 4:
				System.out.println("﻿========== 특정 학생 삭제 ==========");
				removeStudent(); 
				break;
			case 5:
				System.out.println("﻿========== 특정 학생 정보 수정 ==========");
				updateStudent(); 
				break;
			case 6:
				System.out.println("﻿========== 총점 내림차순 정렬 및 석차 부여 ==========");
				sortByTotalDesc();
				break;
			case 7:
				System.out.println("﻿========== 총점이 같으면 id 내림차순 정렬  ==========");
				sortByTotalAsc();
				break;
			case 8:
				System.out.println("프로그램 종료");
				exitBtn = true;
				break;
			default:
				System.out.println("다시 입력해주세요.");
				break;
			}
		}
	}

	private void addDummy() {
	    // Run.sc 대신, 이미 선언되어 있는 controller 객체를 사용합니다.
	    // controller에 정의된 addStudent() 메서드로 학생을 하나씩 추가합니다.
	    controller.addStudent(new Student("마길동1", 260601, 90, 19, 90));
	    controller.addStudent(new Student("라길동2", 260602, 90, 80, 37));
	    controller.addStudent(new Student("다길동3", 260603, 81, 54, 72));
	    controller.addStudent(new Student("나길동4", 260604, 77, 67, 74));
	    controller.addStudent(new Student("가길동5", 260605, 50, 90, 93));
	    
	    System.out.println("시스템: 테스트용 더미 데이터 5명이 추가되었습니다.");
	}
	
	private void addStudent() {
		System.out.println("이름 입력 : ");
		String name = Run.sc.nextLine().trim();
		System.out.println("번호 입력 : ");
		int no = Integer.parseInt(Run.sc.nextLine());
		System.out.println("국어 점수 입력 : ");
		int kor = Integer.parseInt(Run.sc.nextLine());
		System.out.println("영어 점수 입력 : ");
		int eng = Integer.parseInt(Run.sc.nextLine());
		System.out.println("수학 점수 입력 : ");
		int math = Integer.parseInt(Run.sc.nextLine());
		Student student = new Student(name, no, kor, eng, math);
		
		int result = controller.addStudent(student);
		if (result == 1) {
			System.out.printf("추가 성공 : %s\n", student);
		} else {
			System.out.printf("추가 실패\n");
		}
	}

	private void printAll() {
		List<Student> printAll = controller.printAll();
		if(printAll.isEmpty()) {
			System.out.println("등록된 학생이 없습니다.");
			return;
		}
		for (Student student : printAll) {
			System.out.println(student);
		}
	}

	private void searchStudent() {
		System.out.println("찾고싶은 이름 입력 : ");
		String name = Run.sc.nextLine().trim();
		System.out.println("아이디 입력 : ");
		int id = Integer.parseInt(Run.sc.nextLine());
		Student findName = controller.searchStudent(name, id);
		
		if (findName != null) {
			System.out.printf("찾으신 정보 : %s\n", findName);
		} else {
			System.out.println("없는 학생입니다.\n");
		}
	}

	private void removeStudent() {
		System.out.println("삭제하고 싶은 학생 이름 입력 : ");
		String name = Run.sc.nextLine().trim();
		
		Student deletedStudent = controller.removeStudent(name); 
		
		if (deletedStudent != null) {
			System.out.printf("삭제 완료 : %s\n", deletedStudent);
		} else {
			System.out.println("없는 학생입니다.\n");
		}
	}

	private void updateStudent() {
		System.out.println("아이디 입력 : ");
		int id = Integer.parseInt(Run.sc.nextLine());
		System.out.println("이름 입력 : ");
		String name = Run.sc.nextLine().trim();
		
		
		System.out.println("새로운 국어 점수 입력 : ");
		int kor = Integer.parseInt(Run.sc.nextLine());
		System.out.println("새로운 영어 점수 입력 : ");
		int eng = Integer.parseInt(Run.sc.nextLine());
		System.out.println("새로운 수학 점수 입력 : ");
		int math = Integer.parseInt(Run.sc.nextLine());
		Student student = new Student(name, id, kor, eng, math);
		
		Student findName = controller.searchStudent(student.getName(), student.getId());
		
		Student newInfo = controller.updateStudent(id, name, student);
		
		if (findName != null) {
			System.out.printf("수정 완료 : %s\n", newInfo);
		} else {
			System.out.println("수정 실패하였습니다.\n");
		}
	}

	private void sortByTotalDesc() {
		List<Student> sortList = controller.sortByTotalDesc();
		if (sortList != null) {
			System.out.println("정렬 성공");
			for (Student student : sortList) {
				System.out.println(student);
			}
		} else {
			System.out.println("정렬 실패");
		}
	}
	
	private void sortByTotalAsc() {
		List<Student> sortList = controller.sortByTotalDesc();
		if (sortList != null) {
			System.out.println("정렬 성공");
			for (Student student : sortList) {
				System.out.println(student);
			}
		} else {
			System.out.println("정렬 실패");
		}
	}
}