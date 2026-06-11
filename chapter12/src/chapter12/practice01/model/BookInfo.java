package chapter12.practice01.model;

import java.util.Objects;

public class BookInfo implements AutoCloseable{
	private String title;
	private String genre;
	private int rentCount;
	private String[] bookList;
	
	public BookInfo() {
		this(null, null, 0);
	}

	public BookInfo(String title, String genre, int rentCount) {
		super();
		this.title = title;
		this.genre = genre;
		this.rentCount = 5;
		bookList = new String[5];
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

	public String[] getBookList() {
		return bookList;
	}

	public void setBookList(String[] bookList) {
		this.bookList = bookList;
	}
	
	 @Override
	public boolean equals(Object obj) {
		 if (!(obj instanceof BookInfo)) {
			return false;
		} 
		 BookInfo bookInfo = (BookInfo) obj;
		 
		 if (this.title.equals(bookInfo.title) && this.genre.equals(bookInfo.genre)) {
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
		return "BookInfo [title=" + title + ", genre=" + genre + ", rentCount=" + rentCount + "]";
	}

	 @Override
	 public void close() throws Exception {
		// TODO Auto-generated method stub
		
	 }
	
}
