package application.service;


import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import application.model.Missionaire;

import application.repository.MissionaireRepository;
@Service
public class MissionaireServicesImpl implements MissionaireServices {

	  @Autowired
		private MissionaireRepository missionnaireRepository ; 
		 
		@Override
		public List<Missionaire> getMissionnaires() {
			// TODO Auto-generated method stub
			return missionnaireRepository.findAll() ; 	}

		@Override
		public void addMissionaire(Missionaire missionaire) {
			missionnaireRepository.save(missionaire) ; 
			
		}

		@Override
		public void updateMissionaire(Missionaire missionaire) {
			
			
			missionnaireRepository.save(missionaire) ; 
			
		}

		@Override
		public void deleteteMissionaire(Long cin) {
			
			Missionaire missionaire = new Missionaire() ; 
			missionaire.setCin(cin);
			missionnaireRepository.delete(missionaire);
		}

		
		public Optional<Missionaire> getMissionnaire(String cin ) {
			// TODO Auto-generated method stub
			return missionnaireRepository.getMiss(cin)  ; 
		}
	
	
}
