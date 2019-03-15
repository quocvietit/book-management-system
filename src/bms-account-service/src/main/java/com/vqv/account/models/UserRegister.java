/*
 *-------------------------------------------------------
 * - Author: VietVQ
 * - Created: 3/15/2019
 * - Version: 2019
 * - Copy right @src
 *--------------------------------------------------------
 */

package com.vqv.account.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegister {
	private String userName;

	private String password;

	private String confirmPassword;
}
