package pl.innovestments.meetexperts.web.service;

import pl.innovestments.meetexperts.model.security.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
