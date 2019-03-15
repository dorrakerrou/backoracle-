package application.repository;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import application.model.Missionaire;
@Repository
public interface MissionaireRepository extends JpaRepository<Missionaire , String>{

	@Query("select o from Missionaire o where o.cin=:x")
	public Optional<Missionaire> getMiss(@Param("x")String cin); 
	
}
