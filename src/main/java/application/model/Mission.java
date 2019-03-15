package application.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="Mission")
@NamedQuery(name="Mission.findAll", query="SELECT m FROM Mission m")
public class Mission implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long code_mission;
	private String objetA;
	private String objetF;
	private Date date_debut;
	private Date date_fin;
	
	

	@ManyToOne
	@JsonIgnore
	private MotClé Motcle;

	
	@OneToMany(mappedBy="mission")
	@JsonIgnore
	private Collection<Ord_Miss> ordmiss;


	public Long getCode_mission() {
		return code_mission;
	}


	

	public Collection<Ord_Miss> getOrdmiss() {
		return ordmiss;
	}




	public void setOrdmiss(Collection<Ord_Miss> ordmiss) {
		this.ordmiss = ordmiss;
	}




	public void setCode_mission(Long code_mission) {
		this.code_mission = code_mission;
	}



	public String getObjetA() {
		return objetA;
	}



	public void setObjetA(String objetA) {
		this.objetA = objetA;
	}



	public String getObjetF() {
		return objetF;
	}



	public void setObjetF(String objetF) {
		this.objetF = objetF;
	}



	public Date getDate_debut() {
		return date_debut;
	}



	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}



	public Date getDate_fin() {
		return date_fin;
	}



	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}



	public MotClé getMotcle() {
		return Motcle;
	}



	public void setMotcle(MotClé motcle) {
		Motcle = motcle;
	}



	public Mission() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Mission(Long code_mission, String objetA, String objetF, Date date_debut, Date date_fin, MotClé motcle,
			Collection<Ord_Miss> ordmiss) {
		super();
		this.code_mission = code_mission;
		this.objetA = objetA;
		this.objetF = objetF;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		Motcle = motcle;
		this.ordmiss = ordmiss;
	}



	
	
}
