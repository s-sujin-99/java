package bookLent.model.vo;

import java.util.Objects;

public class Book {
	private String[] Book;
 	private String title;
	private String genre;
	private int rentCount;
	
	Book() {
		this(null,null,0);
	}

	public Book(String title, String genre, int rentCount) {
		Book = new String[5];
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

	public String[] getBook() {
		return Book;
	}

	public void setBook(String[] book) {
		this.Book = book;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Book)) {
			return false;
		}
		Book bk = (Book)obj;
		if (this.title.equals(bk.title) && this.genre.equals(bk.genre)) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "도서명 : " + title + " / 장르 : " + genre + " / 대여횟수 : "
				+ rentCount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(title,genre);
	}
	
	
	
	
	
}
