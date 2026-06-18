package chapter17.practice01.model;

import java.util.Objects;

public class Music implements Comparable<Music> {
	private String title;
	private String singer;
	public Music() {
		this(null,null);
	}
	
	public Music(Music other) {
		this.title = other.title;
		this.singer = other.singer;
	}
	
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Music) {
			Music music = (Music) obj;
			if (music.singer.equals(this.singer) && music.title.equals(this.title)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(singer, title);
	}

	@Override
	public int compareTo(Music o) {
		
		return o.singer.compareTo(this.singer);
	}

	@Override
	public String toString() {
		return title + " - " + singer ;
	}
	
	

	
}
