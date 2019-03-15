package application.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ord_Miss implements Serializable{
	
	
	@Id
	private Long num_ord ; 
	
	private Date Date_depart ; 
	private Date Date_arrivee ;
	private Double tot_mission ; 
	private Double tot_transport ; 
	

	@ManyToOne
	private Mission mission ; 
	
	@ManyToOne
	private Missionaire missionnaire;

	public Long getNum_ord() {
		return num_ord;
	}

	public void setNum_ord(Long num_ord) {
		this.num_ord = num_ord;
	}

	public Date getDate_depart() {
		return Date_depart;
	}

	public void setDate_depart(Date date_depart) {
		Date_depart = date_depart;
	}

	public Date getDate_arrivee() {
		return Date_arrivee;
	}

	public void setDate_arrivee(Date date_arrivee) {
		Date_arrivee = date_arrivee;
	}

	public Double getTot_mission() {
		return tot_mission;
	}

	public void setTot_mission(Double tot_mission) {
		this.tot_mission = tot_mission;
	}

	public Double getTot_transport() {
		return tot_transport;
	}

	public void setTot_transport(Double tot_transport) {
		this.tot_transport = tot_transport;
	}

	public Mission getMission() {
		return mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	public Missionaire getMissionnaire() {
		return missionnaire;
	}

	public void setMissionnaire(Missionaire missionnaire) {
		this.missionnaire = missionnaire;
	}

	public Ord_Miss() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ord_Miss(Long num_ord, Date date_depart, Date date_arrivee, Double tot_mission, Double tot_transport,
			Mission mission, Missionaire missionnaire) {
		super();
		this.num_ord = num_ord;
		Date_depart = date_depart;
		Date_arrivee = date_arrivee;
		this.tot_mission = tot_mission;
		this.tot_transport = tot_transport;
		this.mission = mission;
		this.missionnaire = missionnaire;
	}
	

	
}
