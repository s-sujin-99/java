package chapter12.practice02.model;

import java.util.Objects;

public class BookInfo {
	private String title;
	private String genre;
	private int rentCount;
	
	
	BookInfo() {
		this(null,null,0);
	}

	public BookInfo(BookInfo bookInfo){
		this.title = bookInfo.title;
		this.genre = bookInfo.genre;
		this.rentCount = bookInfo.rentCount;
	}
	public BookInfo(String title, String genre, int rentCount) {
		super();
		this.title = title;
		this.genre = genre;
		this.rentCount = rentCount;
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


	public int getRentCount() {
		return rentCount;
	}


	public void setRentCount(int rentCount) {
		this.rentCount = rentCount;
	}


	@Override
	public String toString() {
		return "도서명 : " + title + " / 장르 : " + genre + " / 대여 횟수 : " + rentCount ;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof BookInfo)) {
			return false;
		}
		BookInfo bookInfo = (BookInfo) obj;
		if (bookInfo.title.equals(this.title) && bookInfo.genre.equals(this.genre)) {
			return true;
		}
		
		return false;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(title, genre);
	}
	
	
}
