package com.hy.e_object_array.student.model.vo;

import java.util.Objects;

public class Student {
	private String name;
	private String subject;
	private int score;
	

	//디생
	public Student() {
		this(null,null,0);
		// TODO Auto-generated constructor stub
	}
	
	//멤생
	public Student(String name, String subject, int score) {
		super();
		this.name = name;
		this.subject = subject;
		this.score = score;
	}

	//멤함 get,set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String inform() {
		return null;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) {
			System.out.println("비교 대상이 아닙니다.");
			return false;
		}
		Student stu = (Student)obj;
		if (this.name.equals(stu.name)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + subject + ", score=" + score + "]";
	}
	
}
