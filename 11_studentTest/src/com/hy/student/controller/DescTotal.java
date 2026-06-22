package com.hy.student.controller;

import java.util.Comparator;

import com.hy.student.model.Student;

public class DescTotal implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if (o1 instanceof Student && o2 instanceof Student) {
			Student student1 = (Student) o1;
			Student student2 = (Student) o2;
			int result = Integer.compare(student1.getTotal(), student2.getTotal());
			if (result == 0) {
				result = Integer.compare(student1.getId(), student2.getId());
			}
			return result;
		}
		return 0;
	}

}
