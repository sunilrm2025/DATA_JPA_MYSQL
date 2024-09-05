package sunil.code.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import sunil.code.entities.UserSunilEntity;

public interface UserRepo extends CrudRepository<UserSunilEntity, Integer> {
	
	public List<UserSunilEntity> findByCity(String s);	
	
}	
