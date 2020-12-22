package tn.esprit.spring.tp1springaop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.tp1springaop.entity.User;


@Repository
public interface UserRepository  extends CrudRepository<User, Long> {
	@Query("FROM User u WHERE u.lastName=:lastName")
	List<User> getUsersByLastName(@Param(value="lastName") String lastName);
	
	@Query("FROM User u WHERE u.firstName=:firstName")
	List<User> getUsersByFirstName(@Param(value="firstName") String firstName);
	
	@Query("SELECT coalesce(max(u.id), 0) FROM User u")
	Long getMaxId();
}
