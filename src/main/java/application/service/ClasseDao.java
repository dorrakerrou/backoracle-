package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.model.Classe;
import application.repository.ClasseRepository;


@Service
public class ClasseDao {

	
	@Autowired
	ClasseRepository classerepository;
	
	public List<Classe> findAll(){
		return classerepository.findAll();
	}
}
