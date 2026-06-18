package chapter17.practice01.run;

import java.util.Scanner;

import chapter17.practice01.view.MusicView;

public class Run {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		MusicView musicView = new MusicView();
		musicView.mainMenu();

	}

}
