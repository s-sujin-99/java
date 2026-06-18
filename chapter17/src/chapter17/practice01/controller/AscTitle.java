package chapter17.practice01.controller;

import java.util.Comparator;

import chapter17.practice01.model.Music;

// 오름차순 내림차순
public class AscTitle implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		
		if (o1 instanceof Music && o2 instanceof Music) {
			Music music1 = (Music) o1;
			Music music2 = (Music) o2;
			int result = music1.getTitle().compareTo(music2.getTitle());
			if (result == 0) {
				result = music1.getSinger().compareTo(music2.getSinger());
			}
			return result;
		}
		
		return 0;
	}

}
