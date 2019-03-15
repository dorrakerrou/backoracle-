package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.model.Ord_Miss;

@Repository
public interface Ord_MissRepository extends JpaRepository<Ord_Miss, Long>{ 

}
