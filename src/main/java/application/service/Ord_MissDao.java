package application.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import application.model.Ord_Miss;
import application.repository.Ord_MissRepository;




@Service
@Primary
public class Ord_MissDao {
	@Autowired
    Ord_MissRepository ordmissRepository	 ; 	
	
	public List<Ord_Miss> findAll(){
		return ordmissRepository.findAll();
	}
	
	
	public void ajouter(Ord_Miss o) {
		ordmissRepository.save(o);
	}
	
	public void updateOrd(Ord_Miss o) {
		ordmissRepository.save(o);
	}

}
