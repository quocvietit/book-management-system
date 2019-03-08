/*
 *-------------------------------------------------------
 * - Author: VietVQ
 * - Created: 3/8/2019
 * - Version: 2019
 * - Copy right @src
 *--------------------------------------------------------
 */

package com.vqv.book.controllers;

import com.vqv.book.services.BookService;
import com.vqv.common.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping()
	public Book getBookDetail(
			@PathVariable String title
	){
		return bookService.getBookDetail(title);
	}

//	@GetMapping()
//	public String Test(){
//		return "dd";
//	}

}
