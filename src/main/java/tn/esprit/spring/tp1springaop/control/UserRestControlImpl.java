package tn.esprit.spring.tp1springaop.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.tp1springaop.entity.User;
import tn.esprit.spring.tp1springaop.service.UserServiceImpl;


@RestController
public class UserRestControlImpl {
	@Autowired
	UserServiceImpl userService;

	// http://localhost:8081/SpringMVC/servlet/
	@RequestMapping("/")
	@ResponseBody
	public String welcome() {
		return "Bonjour, Bienvenue à l'application de test des Web Services REST.";
	}

	// URL : http://localhost:8081/SpringMVC/servlet/retrieve-all-users
	@GetMapping("/retrieve-all-users")
	@ResponseBody
	public List<User> getUsers() {
		List<User> list = userService.retrieveAllUsers();
		return list;
	}

	// http://localhost:8081/SpringMVC/servlet/retrieve-user /{user-id}
	@GetMapping("/retrieve-user/{user-id}")
	@ResponseBody
	public User getEmployee(@PathVariable("user-id") String userId) {
		return userService.findOneById(userId);
	}

	// Ajouter User : http://localhost:8081/SpringMVC/servlet/add-user
	@PostMapping("/add-user")
	@ResponseBody
	public User addUser(@RequestBody User u) {
		User user = userService.addUser(u);
		return user;
	}

	// Supprimer User : http://localhost:8081/SpringMVC/servlet/
	// delete-user/{user-id}
	@DeleteMapping("/delete-user/{user-id}")
	@ResponseBody
	public void deleteEmployee(@PathVariable("user-id") Long userId) {
		userService.deleteUser(userId);
	}

	// Modifier User
	// http://localhost:8081/SpringMVC/servlet/modify-user
	@PutMapping("/modify-user")
	@ResponseBody
	public User updateEmployee(@RequestBody User user) {
		return userService.updateUser(user);
	}
}
