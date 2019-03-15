/*
 *-------------------------------------------------------
 * - Author: VietVQ
 * - Created: 3/15/2019
 * - Version: 2019
 * - Copy right @src
 *--------------------------------------------------------
 */

package com.vqv.account.services;

import com.vqv.account.models.UserRegister;
import com.vqv.account.repositories.UserRepository;
import com.vqv.common.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterService {
	@Autowired
	private AccountService accountService;

	@Autowired
	private UserRepository userReponsitory;

	public User register(UserRegister userRegister) {
		if (!accountService.checkUserNameIsExsits(userRegister.getUserName())) {
			return null;
		}

		if (!accountService.checkConfirmPassword(userRegister.getPassword(), userRegister.getConfirmPassword())) {
			return null;
		}

		if (!accountService.checkPassword(userRegister.getPassword())) {
			return null;
		}

		User user = new User();
		user.setUserName(userRegister.getUserName());
		user.setPassword(accountService.hashPassword(userRegister.getPassword()));

		return userReponsitory.save(user);
	}

}
