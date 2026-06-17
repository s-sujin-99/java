package com.hy.book.model.vo;

import java.util.Objects;

public class Book implements Comparable<Book>{
	private String title;
	private String genre;
	private int rentCount;
	
	public Book() {
		this(null,null,0);
	}
	
	public Book(Book other) {
		this.title = other.title;
		this.genre = other.genre;
		this.rentCount = other.rentCount;
	}

	public Book(String title, String genre, int rentCount) {
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
	public boolean equals(Object obj) {
		if(!(obj instanceof Book)) {
			return false;
		}
		
		Book book = (Book) obj;
		if (book.title.equals(title) && book.genre.equals(genre)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(title, genre);
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", genre=" + genre + ", rentCount=" + rentCount + "]";
	}

	@Override
	public int compareTo(Book o) {
		int result = Integer.compare(this.rentCount, o.rentCount);
		if (result == 0) {
			result = this.title.compareTo(o.title);
		}
		return result;
	}
	
}
