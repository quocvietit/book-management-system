/*
 *-------------------------------------------------------
 * - Author: VietVQ
 * - Created: 3/15/2019
 * - Version: 2019
 * - Copy right @src
 *--------------------------------------------------------
 */

package com.vqv.account.services;

import com.vqv.account.repositories.UserRepository;
import com.vqv.common.models.User;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class AccountService {
	@Autowired
	private UserRepository userReponsitory;

	public boolean checkUserNameIsExsits(String userName){
		if(StringUtils.isBlank(userName)){
			return false;
		}

		User user = userReponsitory.findByUserName(userName);
		return ObjectUtils.isEmpty(user);
	}

	public boolean checkPassword(String password){
		//code hanle here
		return true;
	}

	public boolean checkConfirmPassword(String password, String confirmPassword){
		//code hanle here
		return true;
	}

	public String hashPassword(String password){
		if(StringUtils.isBlank(password)){
			return password;
		}

		return DigestUtils.sha256Hex(password);

	}
}
