package application.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import application.model.Groupe;

import application.repository.GroupeRepository;

@Service
public class GroupeServiceImpl  {

	@Autowired
	GroupeRepository grouperepository;
	
	public List<Groupe> findAll(){
		return grouperepository.findAll();
	}


}
