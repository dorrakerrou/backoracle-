package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.model.DeptGen;
import application.repository.DeptGenRepository;

@Service
public class DeptGenDao {
	
	@Autowired
	DeptGenRepository deptrepository;
	
	public List<DeptGen> findAll(){
		return deptrepository.findAll();
	}


}
