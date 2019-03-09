/*
 *-------------------------------------------------------
 * - Author: VietVQ
 * - Created: 3/8/2019
 * - Version: 2019
 * - Copy right @book
 *--------------------------------------------------------
 */

package com.vqv.common.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "book")
@Getter
@Setter
public class Book {
	@Id
	@GeneratedValue
	private UUID id;

	private String title;

	private String summary;

	private float price;

	@Column(name = "created_date")
	private Date createdDate;

	private Date modified;

	@Column(name = "is_active")
	private boolean isActive;

	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;

	@ManyToOne
	@JoinColumn(name = "publisher_id")
	private Publisher publisher;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
}
