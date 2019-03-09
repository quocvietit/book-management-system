/*
 *-------------------------------------------------------
 * - Author: VietVQ
 * - Created: 3/8/2019
 * - Version: 2019
 * - Copy right @book
 *--------------------------------------------------------
 */

package com.vqv.book.repositories;

import com.vqv.common.models.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface BookRepository extends CrudRepository<Book, UUID> {
	Book findBookByTitle(String title);
}
