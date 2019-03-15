package application.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the MISSIONAIRE database table.
 * 
 */
@Entity
@NamedQuery(name="Missionaire.findAll", query="SELECT m FROM Missionaire m")
public class Missionaire implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MISSIONAIRE_IDMISSIONAIRE_GENERATOR", sequenceName="MISSIONAIRE_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MISSIONAIRE_IDMISSIONAIRE_GENERATOR")
	@Column(name="ID_MISSIONAIRE")
	private long idMissionaire;
	
	@Column(name="CIN")
	private long cin;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_CIN")
	private Date dateCin;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_NAISSANCE")
	private Date dateNaissance;
	
	@ManyToOne
	@JoinColumn(name="ID_GROUPE")
	private Groupe groupe;
	
	@ManyToOne
	@JoinColumn(name="idgrade")
	private Grade grade;

	@ManyToOne
	@JoinColumn(name="idclasse")
	private Classe classe;

	@ManyToOne
	@JoinColumn(name="idfct")
	private Fonction fonction;

	@ManyToOne
	@JoinColumn(name="idcat")
	private Categorie categorie;

	@Column(name="LIEU_NAISSANCE_AR")
	private String lieuNaissanceAr;

	@Column(name="LIEU_NAISSANCE_FR")
	private String lieuNaissanceFr;

	private String matricule;

	@Column(name="NATIONALITE_AR")
	private String nationaliteAr;

	@Column(name="NATIONALITE_FR")
	private String nationaliteFr;

	@Column(name="NOM_AR")
	private String nomAr;

	@Column(name="NOM_FR")
	private String nomFr;

	@Column(name="PRENOM_AR")
	private String prenomAr;

	@Column(name="PRENOM_FR")
	private String prenomFr;

	



	@OneToMany
	private Collection<Ord_Miss> ordmiss;
	
	@ManyToOne 
	private DeptGen dept;

	
	public Missionaire() {
	}

	public long getIdMissionaire() {
		return this.idMissionaire;
	}

	public void setIdMissionaire(long idMissionaire) {
		this.idMissionaire = idMissionaire;
	}

	public long getCin() {
		return this.cin;
	}

	public void setCin(long cin) {
		this.cin = cin;
	}

	public Date getDateCin() {
		return this.dateCin;
	}

	public void setDateCin(Date dateCin) {
		this.dateCin = dateCin;
	}

	public Date getDateNaissance() {
		return this.dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public Fonction getFonction() {
		return fonction;
	}

	public void setFonction(Fonction fonction) {
		this.fonction = fonction;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public String getLieuNaissanceAr() {
		return this.lieuNaissanceAr;
	}

	public void setLieuNaissanceAr(String lieuNaissanceAr) {
		this.lieuNaissanceAr = lieuNaissanceAr;
	}

	public String getLieuNaissanceFr() {
		return this.lieuNaissanceFr;
	}

	public void setLieuNaissanceFr(String lieuNaissanceFr) {
		this.lieuNaissanceFr = lieuNaissanceFr;
	}

	public String getMatricule() {
		return this.matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNationaliteAr() {
		return this.nationaliteAr;
	}

	public void setNationaliteAr(String nationaliteAr) {
		this.nationaliteAr = nationaliteAr;
	}

	public String getNationaliteFr() {
		return this.nationaliteFr;
	}

	public void setNationaliteFr(String nationaliteFr) {
		this.nationaliteFr = nationaliteFr;
	}

	public String getNomAr() {
		return this.nomAr;
	}

	public void setNomAr(String nomAr) {
		this.nomAr = nomAr;
	}

	public String getNomFr() {
		return this.nomFr;
	}

	public void setNomFr(String nomFr) {
		this.nomFr = nomFr;
	}

	public String getPrenomAr() {
		return this.prenomAr;
	}

	public void setPrenomAr(String prenomAr) {
		this.prenomAr = prenomAr;
	}

	public String getPrenomFr() {
		return this.prenomFr;
	}

	public void setPrenomFr(String prenomFr) {
		this.prenomFr = prenomFr;
	}

	

	
	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}

	public DeptGen getDept() {
		return dept;
	}

	public void setDept(DeptGen dept) {
		this.dept = dept;
	}

	public Missionaire(long idMissionaire, long cin, Date dateCin, Date dateNaissance, Groupe groupe, Grade grade,
			Classe classe, Fonction fonction, Categorie categorie, String lieuNaissanceAr, String lieuNaissanceFr,
			String matricule, String nationaliteAr, String nationaliteFr, String nomAr, String nomFr, String prenomAr,
			String prenomFr, DeptGen dept) {
		super();
		this.idMissionaire = idMissionaire;
		this.cin = cin;
		this.dateCin = dateCin;
		this.dateNaissance = dateNaissance;
		this.groupe = groupe;
		this.grade = grade;
		this.classe = classe;
		this.fonction = fonction;
		this.categorie = categorie;
		this.lieuNaissanceAr = lieuNaissanceAr;
		this.lieuNaissanceFr = lieuNaissanceFr;
		this.matricule = matricule;
		this.nationaliteAr = nationaliteAr;
		this.nationaliteFr = nationaliteFr;
		this.nomAr = nomAr;
		this.nomFr = nomFr;
		this.prenomAr = prenomAr;
		this.prenomFr = prenomFr;
		this.dept = dept;
	}

	



}