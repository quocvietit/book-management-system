/*
 *-------------------------------------------------------
 * - Author: VietVQ
 * - Created: 3/15/2019
 * - Version: 2019
 * - Copy right @src
 *--------------------------------------------------------
 */

package com.vqv.common.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue
	private UUID id;

	@JoinColumn(name = "user_name")
	private String userName;

	private String password;

	@JoinColumn(name = "first_name")
	private String firstName;

	@JoinColumn(name = "last_name")
	private String lastName;
}
