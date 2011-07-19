package com.springinpractice.ch06.dao;

/**
 * Supplements {@link com.springinpractice.ch04.service.AccountService} by providing a way to look up a user's password.
 * We need this to implement the {@link org.springframework.security.core.userdetails.UserDetailsService} interface.
 */
public interface UserDetailsDao {

	/**
	 * <p>
	 * Return the password associated with a given username.
	 * </p>
	 * 
	 * @param username
	 *            username for which the password is desired
	 * @return password
	 */
	String findPasswordByUsername(String username);
}
