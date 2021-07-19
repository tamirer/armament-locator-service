package iaf.blueflame.repositories;

import iaf.blueflame.entities.MissionStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionStatusRepository extends JpaRepository<MissionStatus, Long> {
}
