/*
 *-------------------------------------------------------
 * - Author: VietVQ
 * - Created: 3/8/2019
 * - Version: 2019
 * - Copy right @book
 *--------------------------------------------------------
 */

package com.vqv.common;

public class Contansts {
	private Contansts(){
		//Not create new instance
	}

	public static class Security{
		private Security(){
		}

		public static final String SECRET = "SecretKeyToGenJWTs";
		public static final long EXPIRATION_TIME = 300; //5p
		public static final String TOKEN_PREFIX = "Bearer ";
		public static final String HEADER_STRING = "Authorization";
	}

}
