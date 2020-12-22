package tn.esprit.spring.tp1springaop.service;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.tp1springaop.entity.User;
import tn.esprit.spring.tp1springaop.repository.UserRepository;

@Service
@Slf4j
public class UserServiceImpl implements IUserService{
	@Autowired
	public UserRepository ur;
	private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);
	@Override
	public User addUser(User user) {
		return ur.save(user);
	}


	@Override
	public List<User> retrieveAllUsers() { return (List<User>) ur.findAll(); }

	@Override
	public User findOneById(String userId) {
		return ur.findById((Long.getLong(userId))).get();
	}

	@Override
	public User updateUser(User user) {
		return ur.save(user);
	}

	@Override
	public String getFirstNameByUserId(Long userId) {
		return ur.findById(userId).get().getFirstName();
	}

	@Override
	public String getLastNameByUserId(Long userId) {
		return ur.findById(userId).get().getLastName();
	}

	@Override
	public String deleteUser(Long userId) {
		ur.delete(ur.findById(userId).get());
		return "ok";
	}
}
