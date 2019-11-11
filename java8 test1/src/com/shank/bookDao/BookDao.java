package com.shank.bookDao;

import java.util.ArrayList;
import java.util.List;

import com.shank.book.Book;



public class BookDao {
	
	
	public List<Book> getBooks()
	{
		List<Book> books= new ArrayList<>();
		books.add(new Book(101,"bootbasics",400));
		books.add(new Book(102,"springbasics",350));
		books.add(new Book(103,"javabasics",249));
		
		return books;
		
	}

}
