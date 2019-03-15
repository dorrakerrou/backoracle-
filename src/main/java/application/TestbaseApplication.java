package application;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import application.model.Role;
import application.model.User;
import application.repository.RoleRepository;
import application.repository.UserRepository;
import application.util.RoleEnum;

@SpringBootApplication
public class TestbaseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(TestbaseApplication.class, args);
RoleRepository roleRepository = ctx.getBean(RoleRepository.class);
		
        Role roleOrd = new Role(RoleEnum.ROLE_ORD) ; 
		Role roleUser = new Role(RoleEnum.ROLE_USER);
		Role roleAdmin = new Role(RoleEnum.ROLE_ADMIN);
		Role roleControl = new Role(RoleEnum.ROLE_CONTROL);
		Role rolePayeur = new Role(RoleEnum.ROLE_PAYEUR) ; 
		Role roleMinstr = new Role(RoleEnum.ROLE_MINSTR) ; 
		
		
		roleRepository.save(roleOrd) ; 
		roleRepository.save(roleControl) ;
		roleRepository.save(rolePayeur) ; 
		roleRepository.save(roleMinstr) ; 
		roleRepository.save(roleUser);
		roleRepository.save(roleAdmin);
		
		UserRepository userRepository = ctx.getBean(UserRepository.class);
		
		User user = new User("user", "password1", true);
		user.setRoles(Arrays.asList(roleUser));
		
		userRepository.save(user);
		
		User admin = new User("12345678", "password2", true);
		admin.setRoles(Arrays.asList(roleUser, roleAdmin));
		
		userRepository.save(admin);

		User user1 = new User("11406260", "ikram", true);
		user1.setRoles(Arrays.asList(roleOrd,roleUser));
		userRepository.save(user1);
		

		
	}
	}


