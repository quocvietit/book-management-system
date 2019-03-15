/*
 *-------------------------------------------------------
 * - Author: VietVQ
 * - Created: 3/15/2019
 * - Version: 2019
 * - Copy right @src
 *--------------------------------------------------------
 */

package com.vqv.core.reponsitories;

import com.vqv.common.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserReponsitory extends CrudRepository<User, UUID> {
	User findByUserName(String userName);
}
