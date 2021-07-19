package iaf.blueflame.repositories;

import iaf.blueflame.entities.Squad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository extends JpaRepository<Squad, Long> {
}
