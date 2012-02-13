package org.ldv.sio.getap.app.impl;

import java.util.ArrayList;
import java.util.List;

import org.ldv.sio.getap.app.IFHauthLoginService;
import org.ldv.sio.getap.app.User;
import org.ldv.sio.getap.app.UserLoginCriteria;
import org.springframework.stereotype.Service;

/**
 * Stub implementation of a AuthLoginService using a predefined set of Users
 */
@Service("serviceAuthMemory")
public class StubAuthLoginService implements IFHauthLoginService {

	public User getAuthUser(UserLoginCriteria user) {
		List<User> users = this.getStubUsers();
		for (User userIndb : users) {
			if (userIndb.getNom().equals(user.getLogin()))
				return userIndb;
		}
		return null;
	}

	private List<User> getStubUsers() {
		List<User> users = new ArrayList<User>();
		users.add(new User(1L, "Dennis", "Ritchie", "", "admin"));
		users.add(new User(2L, "Jean David", "Ichbiah", "ada", "prof-intervenant"));
		users
		    .add(new User(3L, "Guido ", "van Rossum", "python", "prof-intervenant"));
		users.add(new User(4L, "Gérard", "Berry", "Esterel", "prof-intervenant"));
		users.add(new User(5L, "Ada", "Lovelace", "", "prof-principal"));
		users.add(new User(6L, "James", "Gosling", "TSTG", "eleve"));
		users.add(new User(7L, "Bertrand", "Meyer", "TES", "eleve"));
		users.add(new User(8L, "Niklaus", "Wirth", "TS", "eleve"));
		users.add(new User(9L, "Rasmus", "Lerdorf", "php", "eleve"));
		users
		    .add(new User(10L, "Yukihiro", "Matsumoto", "ruby", "prof-intervenant"));

		return users;
	}

}
