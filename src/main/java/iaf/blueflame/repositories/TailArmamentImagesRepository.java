package iaf.blueflame.repositories;

import iaf.blueflame.entities.TailArmamentImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TailArmamentImagesRepository extends JpaRepository<TailArmamentImages, Long> {
}
