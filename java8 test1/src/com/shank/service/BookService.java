package com.shank.service;

import java.util.Collections;

import java.util.List;

import com.shank.book.Book;
import com.shank.bookDao.BookDao;

public class BookService {

	public List<Book> getBooksInSort() {
		List<Book> books = new BookDao().getBooks();
		Collections.sort(books, (o1, o2) -> o1.getName().compareTo(o2.getName()));

		return books;

	}

	public static void main(String args[]) {
		System.out.println(new BookService().getBooksInSort());
	}
}
