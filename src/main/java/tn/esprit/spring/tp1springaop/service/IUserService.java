package tn.esprit.spring.tp1springaop.service;

import java.util.List;
import tn.esprit.spring.tp1springaop.entity.User;

public interface IUserService {
	User addUser(User user);
	String getFirstNameByUserId(Long userId);
	String getLastNameByUserId(Long userId);
	String deleteUser(Long userId);
	List<User> retrieveAllUsers();
	User findOneById(String userId);
	User updateUser(User user);
}
