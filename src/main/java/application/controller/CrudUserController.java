package application.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Role;
import application.model.User;
import application.repository.RoleRepository;
import application.util.RoleEnum;

@RestController
@RequestMapping("/crudUser")
@CrossOrigin
public class CrudUserController extends CrudController<User, Long> {
	
		
		@Autowired
		private RoleRepository roleRepository;
		
		
		public List<User> getAll(){
			List<User> users = super.getAll();
			users.forEach(user -> user.setPassword(null));
			return users;
		}
		
		public void add(@RequestBody User user) {
			Role role = roleRepository.findByName(RoleEnum.ROLE_USER.getName());
			user.setRoles(Arrays.asList(role));
			user.setEnable(true);
			super.add(user);
		}

}
