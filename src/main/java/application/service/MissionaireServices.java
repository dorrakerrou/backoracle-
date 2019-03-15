package application.service;

import java.sql.Date;
import java.util.List;

import application.model.Missionaire;

public interface MissionaireServices  {
	
	
List<Missionaire> getMissionnaires() ; 
	
	void addMissionaire(Missionaire missionaire) ; 
	
	void updateMissionaire(Missionaire missionaire) ; 
	
	void deleteteMissionaire(Long cin) ;

}
