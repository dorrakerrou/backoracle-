package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Mission;
import application.service.MissionDao;

@RestController
@RequestMapping("/api/mission")
@CrossOrigin
public class MissionController {
	
	@Autowired
	MissionDao missiondao;
	
	
	@GetMapping
	public List<Mission> getMissions() {
		return missiondao.getMissions() ; 
		
	}
	@PostMapping
	public void addMission(@RequestBody Mission Mission)
	{
		missiondao.addMission(Mission);
	}
	
	@PutMapping
	public void updateMission(@RequestBody Mission missiona)
	{
		missiondao.updateMission(missiona);
		
	}
	@DeleteMapping("/{code}")
	public void deleteMission(@PathVariable Long code)
	{
		missiondao.deleteMission(code);
	}
	

}
