package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Ord_Miss;
import application.service.Ord_MissDao;

@RestController
@RequestMapping("/api/ordMiss")
@CrossOrigin
public class Ord_MissController {
	

	@Autowired
	Ord_MissDao ordMissDao;
	
	
	@GetMapping
	public List<Ord_Miss> getOrds() {
		return ordMissDao. findAll(); 
		
	}
	
	@PostMapping
	public void addOrdMiss(@RequestBody Ord_Miss ordMiss)
	{
		 ordMissDao.ajouter(ordMiss);
	}
	
	@PutMapping
	public void Modiford(@RequestBody Ord_Miss o) {
		ordMissDao.updateOrd(o);
		
	}

}
