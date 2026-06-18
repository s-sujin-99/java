package chapter17.practice01.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chapter17.practice01.model.Music;

public class MusicController {
	private List<Music> musics;
	private List<Music> nMusics;

	public MusicController() {
		musics = new ArrayList<Music>();
		nMusics = new ArrayList<Music>();
	}

	public int addList(Music music) {
		int result = 0;
		try {
			musics.add(music);
			result = 1;
		} catch (Exception e) {
			result = 0;
		}

		return result;
	}

	public int addAtZero(Music music) {

		int result = 0;
		try {
			musics.add(0, music);
			result = 1;
		} catch (Exception e) {
			result = 0;
		}

		return result;

	}

	public List<Music> printAll() {
		return musics;
	}

	// 정렬 자료 보관
	public List<Music> sortPrintAll() {
		return nMusics;
	}
	public Music searchMusic(String title) {
		for (Music music : musics) {
			if (music.getTitle().equals(title)) {
				return music;
			}
		}
		return null;
	}

	public Music removeMusic(String title) {
		for (Music music : musics) {
			if (music.getTitle().equals(title)) {
				musics.remove(music);
				return music;
			}
		}
		return null;
	}

	public Music setMusic(String title, Music music) {

		for (int i = 0; i < musics.size(); i++) {
			if (musics.get(i).equals(title)) {
				musics.set(i, music);
				return musics.get(i);
			}
		}
		return null;
	}

	// TreeSet, TreeMap을 사용하지않고 Compare 로 정렬가능
	public int ascTitle() {
		// 복사
		nMusics.clear();
		for (Music music : musics) {
			if (music != null) {
				nMusics.add(new Music(music));
			}
		}

		try {
			Collections.sort(nMusics, new AscTitle());
			return 1;
		} catch (Exception e) {
			return 0;
		}

	}

	public int descSinger() {
		// 복사
		nMusics.clear();
		for (Music music : musics) {
			if (music != null) {
				nMusics.add(new Music(music));
			}
		}
		
		try {
			Collections.sort(nMusics);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

}
