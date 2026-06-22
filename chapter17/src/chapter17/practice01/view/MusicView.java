package chapter17.practice01.view;

import java.util.List;

import chapter17.practice01.controller.MusicController;
import chapter17.practice01.model.Music;
import chapter17.practice01.run.Run;

public class MusicView {
	
	private MusicController controller;
	
	public MusicView() {
		
		controller = new MusicController();
	}
	public void mainMenu() {
		boolean exitBtn = false;
		while (!exitBtn) {
			System.out.println("1. ﻿마지막 위치에 곡 추가\n2. 첫 위치에 곡 추가\n3. 전체 곡 목록 출력\n4. ﻿특정 곡 검색\n"
					+ "5. 특정 곡 삭제\n6. 특정 곡 정보 수정\n7. 곡명 오름차순 정렬\n8. 가수명 내림차순 정렬\n9. 종료\n");
			int no = Integer.parseInt(Run.sc.nextLine());
			switch (no) {
			case 1:
				System.out.println("﻿========== 마지막 위치에 곡 추가 ==========");
				 addList();
				break;
				
			case 2:
				System.out.println("﻿﻿========== 첫 위치에 곡 추가 ==========");
				 addAtZero();
				break;
				
			case 3:
				System.out.println("﻿========== 전체 곡 목록 출력 ==========");
				printAll();
				break;
				
			case 4:
				System.out.println("﻿========== 특정 곡 검색 ==========");
				searchMusic();
				break;
				
			case 5:
				System.out.println("﻿========== 특정 곡 삭제 ==========");
				removeMusic();
				break;

			case 6:
				System.out.println("﻿========== 특정 곡 정보 수정 ==========");
				setMusic();
				break;

			case 7:
				System.out.println("﻿========== 곡명 오름차순 정렬 ==========");
				ascTitle();
				break;
			
			case 8:
				System.out.println("﻿========== 곡명 내림차순 정렬 ==========");
				descSinger();
				break;

			case 9:
				System.out.println("프로그램 종료");
				exitBtn = true;
				break;
				
			default:
				System.out.println("다시 입력해주세요.");
				break;
			}
			
		}
		
		
	}
	
	private void addList() {
		System.out.println("곡명 : ");
		String title = Run.sc.nextLine();
		System.out.println("가수명 : ");
		String singer = Run.sc.nextLine();
		Music music = new Music(title, singer);
		int result = controller.addList(music);
		if (result ==1) {
			System.out.println(music + " 추가 성공");
		} else if (result == 0){
			System.out.println("추가 실패");			
		}
		
	}
	
	private void addAtZero() {
		System.out.println("곡명 : ");
		String title = Run.sc.nextLine();
		System.out.println("가수명 : ");
		String singer = Run.sc.nextLine();
		Music music = new Music(title, singer);
		int result = controller.addAtZero(music);
		if (result ==1) {
			System.out.println( music + " 첫 위치에 추가 성공");
		} else if (result == 0){
			System.out.println("추가 실패");			
		}
		
	}
	
	private void printAll() {
		List<Music> music = controller.printAll();
		if (music != null) {
			System.out.println(music);
		} else {
			System.out.println("곡을 추가해주세요.");
		}
			
	}
	
	private void searchMusic() {
		System.out.println("곡명 : ");
		String title = Run.sc.nextLine();
		Music music = controller.searchMusic(title);
		if (music != null) {
			System.out.println(music);
		} else {
			System.out.println("곡이 없습니다.");
		}
		
	}
	
	private void removeMusic() {
		System.out.println("곡명 : ");
		String title = Run.sc.nextLine();
		
		Music music = controller.removeMusic(title);
		if (music != null) {
			System.out.println(music + " 삭제 성공");
		} else {
			System.out.println(title + " 곡이 없습니다.");			
		}
		
	}
	
	private void setMusic() {
		System.out.println("수정할 곡명 : ");
		String oldTitle = Run.sc.nextLine().trim();
		
		System.out.println("곡명 : ");
		String title = Run.sc.nextLine();
		System.out.println("가수명 : ");
		String singer = Run.sc.nextLine();
		Music music = new Music(title, singer);

		Music newMusic = controller.setMusic(oldTitle, music);
		if (newMusic != null) {
			System.out.println(music + " 수정 성공");
		} else {
			System.out.println(oldTitle + " 곡이 없습니다.");			
		}
	
	}
	
	private void ascTitle() {
		
		int result = controller.ascTitle();
		if (result == 1) {
			System.out.println("정렬 성공");
			List<Music> musics = controller.sortPrintAll();
			System.out.println(musics);
		} else {
			System.out.println("정렬 실패");
		}
		
	}
	
	private void descSinger() {
		int result = controller.descSinger();
		if (result == 1) {
			System.out.println("정렬 성공");
			List<Music> musics = controller.sortPrintAll();
			System.out.println(musics);
		} else {
			System.out.println("정렬 실패");
		}
		
		
	}
}
