package application.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import application.model.*;

import application.repository.GradeRepository;
@Service
public class GradeServiceImpl  {

	@Autowired
	GradeRepository graderepository;
	
	public List<Grade> findAll(){
		return graderepository.findAll();
	}

	public String getGrade(int codeGrade) {
		return graderepository.getGrade(codeGrade) ; 
	}
	
}
