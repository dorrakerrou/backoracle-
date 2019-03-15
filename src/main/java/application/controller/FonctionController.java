package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import application.model.Fonction;
import application.service.FonctionServiceImpl;

@RestController
@RequestMapping("/api/listfonction")
@CrossOrigin

public class FonctionController {
	@Autowired
	FonctionServiceImpl fonctiondao;
	
	@GetMapping
	public List<Fonction> getAllfonction(){
		return fonctiondao.findAll();
	}
}
