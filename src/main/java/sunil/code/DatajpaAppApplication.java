package sunil.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import sunil.code.repo.UserRepo;
import sunil.code.service.UserService;


@SpringBootApplication
public class DatajpaAppApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(DatajpaAppApplication.class, args);

		UserService userService = context.getBean(UserService.class);	
	//userService.saveUserDetails();
	//	userService.getUser();
	//	userService.getUsers();

	//	userService.getAllUsers();
		
	//	userService.DeleteRecordById();
		
	//	userService.test();
		
		userService.getByCity();
		}}