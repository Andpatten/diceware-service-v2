package edu.cnm.deepdive.dicewareservice.model.dao;

import edu.cnm.deepdive.dicewareservice.model.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

  Optional<User> getUserByOauthKey(String oathKey);

}
