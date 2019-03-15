package application.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import application.model.Fonction;
@Repository
public interface FonctionRepository extends JpaRepository<Fonction, Long>{

}
