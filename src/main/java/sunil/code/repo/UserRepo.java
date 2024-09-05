package sunil.code.repo;

import org.springframework.data.repository.CrudRepository;

import sunil.code.entities.UserSunilEntity;

public interface UserRepo extends CrudRepository<UserSunilEntity, Integer> {
	

}
