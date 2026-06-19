package com.hy.student.run;

import java.util.Scanner;

import com.hy.student.view.StudentMenu;

public class Run {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StudentMenu menu = new StudentMenu();
		menu.mainMenu();
		
	}

}
