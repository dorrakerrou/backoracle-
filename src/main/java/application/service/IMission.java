package application.service;

import java.util.List;

import application.model.Mission;

public interface IMission {
	
List<Mission> getMissions() ; 
	
	void addMission(Mission Mission) ; 
	
	void updateMission(Mission Mission) ; 
	
	void deleteMission(Long code) ; 

}
