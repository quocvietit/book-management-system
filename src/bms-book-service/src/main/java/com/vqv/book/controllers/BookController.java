/*
 *-------------------------------------------------------
 * - Author: VietVQ
 * - Created: 3/8/2019
 * - Version: 2019
 * - Copy right @src
 *--------------------------------------------------------
 */

package com.vqv.book.controllers;

import com.vqv.book.entities.BookDTO;
import com.vqv.book.services.BookService;
import com.vqv.common.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/{title}/detail")
	public Book getBookDetail(
			@PathVariable(name = "title") String title
	) {
		return bookService.getBookDetail(title);
	}

	@PostMapping("/add")
	public Book addBook(
		@RequestBody BookDTO bookDTO
	){
		Book book = new Book();
		book.setTitle(bookDTO.getTitle());
		book.setSummary(bookDTO.getSummary());
		book.setPrice(bookDTO.getPrice());

		return bookService.addBook(book);
	}

}
