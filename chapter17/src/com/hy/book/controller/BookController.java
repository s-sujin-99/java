package com.hy.book.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import com.hy.book.model.vo.Book;


public class BookController {
	private List<Book> books;
	private List<Book> nBooks;
	private static int CUT_LINE;
	private static int COUNT;

	static {
		CUT_LINE = 30;
		COUNT = 5;
	}

	public BookController() {
		books = new Vector<Book>();
		nBooks = new Vector<Book>();

		books.add( new Book("자바의 정석", "IT", 45));
		books.add( new Book("혼공의 C언어", "IT", 45));
		books.add( new Book("피프티 피플", "소설", 50));
		books.add( new Book("꿈 백화점", "소설", 35));
		books.add( new Book("삼국지", "역사", 10));

	}

	public List<Book> printBooks() {
		return books;
	}

	public int sumRentCount() {
		int sum = 0;
		for (int i = 0; i < books.size(); i++) {
			sum += books.get(i).getRentCount();
		}
		return sum;
	}

	public double[] avgRentCount() {
		double[] results = new double[2];
		results[0] = this.sumRentCount();
		results[1] = this.sumRentCount() / COUNT;

		return results;
	}

	public String[] famousBook() {
		String[] isFamous = new String[COUNT];
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getRentCount() > CUT_LINE) {
				isFamous[i] = "인기도서";
			} else {
				isFamous[i] = "일반도서";
			}
		}
		return isFamous;
	}

	public List<Book> sortedBookList() {
		for (Book book : books) {
			nBooks.add(new Book(book));
		}

		Collections.sort(nBooks, Collections.reverseOrder());
//		for (int i = 0; i < nBooks.size(); i++) {
//			for (int j = i + 1; j < nBooks.size() - 1; j++) {
//				if (nBooks.get(i).getRentCount() < nBooks.get(i).getRentCount()) {
//					Book buffer = nBooks.get(i);
//					nBooks.set(i, nBooks.get(j));
//					nBooks.set(i, buffer);
//				}
//			}
//		}

		return nBooks;
	}

	public List<Integer> rankBooks() {
		List<Integer> ranks = new ArrayList<>();
		
		for (int i = 0; i < books.size(); i++) {
			Set<Integer> sameRank = new HashSet<Integer>();
			for (int j = 0; j < books.size(); j++) {
				if (books.get(i).getRentCount() < books.get(j).getRentCount()) {
					sameRank.add(books.get(j).getRentCount());
				}
			}
			ranks.add(sameRank.size() +1);
		}
		return ranks;
	
	}

	
	public String searchBook(String name) {
		
		for (int i = 0; i < books.size(); i++) {
			if (name.equals(books.get(i).getTitle())) {
				return books.get(i).toString();
			}
		}
		return null;
	}

}
