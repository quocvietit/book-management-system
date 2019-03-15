/*
 *-------------------------------------------------------
 * - Author: VietVQ
 * - Created: 3/15/2019
 * - Version: 2019
 * - Copy right @src
 *--------------------------------------------------------
 */

package com.vqv.account.controller;

import com.vqv.account.models.UserRegister;
import com.vqv.account.services.AccountService;
import com.vqv.account.services.UserRegisterService;
import com.vqv.common.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@Autowired
	private UserRegisterService userRegisterService;

	@PostMapping("/register")
	public User register(
			@RequestBody UserRegister userRegister
	){
		if(!ObjectUtils.isEmpty(userRegister)){
			return userRegisterService.register(userRegister);
		}
		return null;
	}
}
