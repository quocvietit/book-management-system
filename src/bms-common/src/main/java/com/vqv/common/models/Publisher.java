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
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "publisher")
@Getter
@Setter
@NoArgsConstructor
public class Publisher {
	@Id
	@GeneratedValue
	private UUID id;

	private String name;

	private String description;
}
