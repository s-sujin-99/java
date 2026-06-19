package com.hy.student.model;

import java.util.Calendar;
import java.util.Objects;

public class Student implements Comparable<Student>{
	private String name;
	private int id;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;
	private static int COUNT = 3;
	
	public Student() {
		this(null, 0, 0, 0, 0);
	}
	
	public Student(String name, int id, int kor, int eng, int math ) {
		super();
		this.name = name;
		this.id = id;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		caculatorScore();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			if (student.id == this.id && student.name.equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "등수 : "+ rank +" [name=" + name + ", id=" + id + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total="
				+ total + ", avg=" + String.format("%.2f", avg) + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return Integer.compare(o.getTotal(), this.getTotal());
	}
	
	public void caculatorScore() {
		this.total = this.getKor() + this.getMath() + this.getEng();;
		this.avg = (double) this.total / COUNT;
	}
	
}
