package movie.model;

import java.util.Objects;

public class Movie {
	private String title;
	private String genre;
	private int watchTime;
	
	public Movie() {
		this(null, null, 0);
	}
	
	public Movie(Movie other) {
		this.title = other.title;
		this.genre = other.genre;
		this.watchTime = other.watchTime;
	}
	
	public Movie(String title, String genre, int watchTime) {
		super();
		this.title = title;
		this.genre = genre;
		this.watchTime = watchTime;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public int getWatchTime() {
		return watchTime;
	}
	
	public void setWatchTime(int watchTime) {
		this.watchTime = watchTime;
	}

	@Override
	public String toString() {
		return "영화 제목 : " + title + " / 장르 : " + genre + " / 시청 시간 : " + watchTime + "만 시간";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Movie)) {
			return false;
		}
		Movie movie = (Movie) obj;
		if (movie.title.equals(this.title)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(title);
	}
}
