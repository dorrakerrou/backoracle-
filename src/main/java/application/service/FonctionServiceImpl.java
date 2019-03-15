package application.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import application.model.*;

import application.repository.FonctionRepository;
@Service
public class FonctionServiceImpl {


	
	@Autowired
	FonctionRepository fonctionrepository;
	
	public List<Fonction> findAll(){
		return fonctionrepository.findAll();
	}

	
}
