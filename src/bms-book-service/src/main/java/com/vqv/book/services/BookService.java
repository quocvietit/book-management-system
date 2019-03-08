/*
 *-------------------------------------------------------
 * - Author: VietVQ
 * - Created: 3/8/2019
 * - Version: 2019
 * - Copy right @book
 *--------------------------------------------------------
 */

package com.vqv.book.services;

import com.vqv.book.repositories.BookRepository;
import com.vqv.common.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Optional;
import java.util.UUID;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public Book getBookDetail(UUID bookId){
		Optional<Book> bookOptional =bookRepository.findById(bookId);

		return 	getBook(bookOptional);
	}

	public Book getBookDetail(String bookTitle){
		Optional<Book> bookOptional = bookRepository.findBookByTitle(bookTitle);

		return getBook(bookOptional);
	}

	public Book addBook(Book book){
		if(ObjectUtils.isEmpty(book)){
			return null;
		}

		Book tmpBook = this.getBookDetail(book.getTitle());
		if(!ObjectUtils.isEmpty(tmpBook)){
			return null;
		}

		return bookRepository.save(book);
	}

	private Book getBook(Optional<Book> bookOptional){
		if(bookOptional.isPresent()){
			return bookOptional.get();
		}

		return null;
	}
}
