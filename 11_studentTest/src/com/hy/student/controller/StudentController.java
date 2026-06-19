package com.hy.student.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.hy.student.model.Student;

public class StudentController {
	private List<Student> studentList = new ArrayList<Student>();
	private List<Student> cStudents = new ArrayList<Student>();

	public int addStudent(Student s) {
		try {
			studentList.add(s);

			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	public List<Student> printAll() {
		return studentList;
	}

	public Student searchStudent(String name, int id) {
		for (Student student : studentList) {
			if (student.getName().equals(name) && student.getId() == id) {
				return student;
			}
		}
		return null;
	}

	public Student removeStudent(String name) {
		try {
			for (int i = 0; i < studentList.size(); i++) {
				if (studentList.get(i).getName().equals(name)) {
					return studentList.remove(i);
				}
			}
		} catch (Exception e) {
			return null;
		}
		return null;
	}

	public Student updateStudent(int id, String name, Student student) {
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId() == id && studentList.get(i).getName().equals(name)) {
				studentList.set(i, student);
				return student;
			}
		}
		return null;
	}

	public List<Student> sortByTotalDesc() {
		cStudents = new ArrayList<Student>(studentList);
		try {
			Collections.sort(cStudents);
			
			for (int i = 0; i < cStudents.size(); i++) {
				if (i == 0) {
					cStudents.get(i).setRank(1);
					continue;
				}
				//앞사람과 total값이 같은지 점검
				if (cStudents.get(i-1).getTotal() == cStudents.get(i).getTotal()) {
					cStudents.get(i).setRank(cStudents.get(i-1).getRank());
				} else {
					cStudents.get(i).setRank(i+1);
				}
				
			}
			
			return cStudents;
		} catch (Exception e) {
			return null;
		}
	}
	
	public List<Student> sortByTotalAsc() {
		cStudents = new ArrayList<Student>(studentList);
		try {
			Collections.sort(cStudents, new DescTotal());
			
			for (int i = 0; i < cStudents.size(); i++) {
				if (i == 0) {
					cStudents.get(i).setRank(1);
					continue;
				}
				//앞사람과 total값이 같은지 점검
				if (cStudents.get(i-1).getTotal() == cStudents.get(i).getTotal()) {
					cStudents.get(i).setRank(cStudents.get(i-1).getRank());
				} else {
					cStudents.get(i).setRank(i+1);
				}
				
			}
			
			return cStudents;
		} catch (Exception e) {
			return null;
		}
	}
}