package sunil.code.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sunil.code.entities.UserSunilEntity;
import sunil.code.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public void test() {
		System.out.println(userRepo.count()+"!!!User COunt ");
		System.out.println("Records Presence or not ?:"+userRepo.existsById(666));
	}
	
	public void DeleteRecordById() {
		userRepo.deleteById(888);
	}
	//Get single user
	public void getUser() {
		Optional<UserSunilEntity> byId = userRepo.findById(888);
		if(byId.isPresent()){
			System.out.println(byId.get());
		}else{
			System.out.println("No Records Found!!!");
		}
	}
	//Get ALl User by Id 
	public void getUsers() {
		List<Integer> asList = Arrays.asList(200,666,888);
		Iterable<UserSunilEntity> allById = userRepo.findAllById(asList);
		allById.forEach(a->{
			System.out.println(a);
		});
	}
	
	// Get all user by FindAll
	public void getAllUsers() {
		Iterable<UserSunilEntity> allById = userRepo.findAll();
		allById.forEach(a->{
			System.out.println(a);
		});
	}

	//Save or insert record by upsert method 
	public void saveUserDetails() {
		UserSunilEntity userEntity=new UserSunilEntity();
		userEntity.setUserId(9898);
		userEntity.setUserNm("Rasha");
		userEntity.setUserEma1il("RAJA@gmail.com");
		userEntity.setAge(30);
		userEntity.setGender("Male");
		userEntity.setCity("Patna");
		userRepo.save(userEntity);
		System.out.println("Save succesfully!!!!!!!!!!!!!!!");
	}
}
