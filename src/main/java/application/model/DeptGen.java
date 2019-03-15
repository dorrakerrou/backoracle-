package application.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity

@Table(name="dept")
@NamedQuery(name="DeptGen.findAll", query="SELECT c FROM DeptGen c")
public class DeptGen {

	

	@Id
	private int code;
	private String liba;
	private String libfr;
	private String type;
	


	@OneToMany(mappedBy="dept")
	private Collection<Missionaire> missionnaire;



	public int getCode() {
		return code;
	}



	public void setCode(int code) {
		this.code = code;
	}



	public String getLiba() {
		return liba;
	}



	public void setLiba(String liba) {
		this.liba = liba;
	}



	public String getLibfr() {
		return libfr;
	}



	public void setLibfr(String libfr) {
		this.libfr = libfr;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public Collection<Missionaire> getMissionnaire() {
		return missionnaire;
	}



	public void setMissionnaire(Collection<Missionaire> missionnaire) {
		this.missionnaire = missionnaire;
	}



	public DeptGen(int code, String liba, String libfr, String type, Collection<Missionaire> missionnaire) {
		super();
		this.code = code;
		this.liba = liba;
		this.libfr = libfr;
		this.type = type;
		this.missionnaire = missionnaire;
	}



	public DeptGen() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
