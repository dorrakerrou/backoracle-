package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import application.model.User;
import application.repository.UserRepository;

public class UserService implements ICrudService<User, Long>{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public void add(User user) {
		userRepository.save(user);
	}

	@Override
	public void update(User user) {
		userRepository.save(user);
	}

	

	@Override
	public void saveAll(Iterable<User> iterable) {
		userRepository.saveAll(iterable);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}
}
