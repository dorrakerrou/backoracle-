package application.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import application.model.Grade;
@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {

	
	@Query("select codeGrade from Grade o where o.codeGrade=:x")
	public String getGrade(@Param("x")int codeGrade); 
}
