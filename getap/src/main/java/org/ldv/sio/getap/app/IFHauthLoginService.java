package org.ldv.sio.getap.app;

/**
 * Service pour authentifier un user
 */
public interface IFHauthLoginService {

	/**
	 * Search for User with the criteria
	 * 
	 * @param user
	 *            the user to authenticate
	 * @return User if is authenticate or null if not
	 */
	public User getAuthUser(UserLoginCriteria user);

}
