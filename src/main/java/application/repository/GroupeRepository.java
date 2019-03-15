package application.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import application.model.Groupe;

@Repository
public interface GroupeRepository extends JpaRepository <Groupe, Long> {
}
