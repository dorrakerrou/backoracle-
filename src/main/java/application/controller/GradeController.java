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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import application.model.Grade;
import application.service.GradeServiceImpl;
import application.service.Services;

@RestController
@CrossOrigin
@RequestMapping
public class GradeController {

	@Autowired
	GradeServiceImpl gradedao;
	
	@GetMapping("/api/listgrade")
	public List<Grade> getAllgrades(){
		return gradedao.findAll();
	}
	
	@GetMapping("/api/listegrade")
	public String getGrade(@RequestParam(name="codeGrade",defaultValue="")int codeGrade)
	{
		return gradedao.getGrade(codeGrade);
	}
}

