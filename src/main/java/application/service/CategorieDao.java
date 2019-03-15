package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.model.Categorie;
import application.repository.CategorieRepository;

@Service
public class CategorieDao {
	
	@Autowired
	CategorieRepository categorierepository;
	
	public List<Categorie> findAll(){
		return categorierepository.findAll();
	}

}
