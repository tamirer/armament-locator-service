package iaf.blueflame.repositories;

import iaf.blueflame.entities.TailArmamentImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TailArmamentImagesRepository extends JpaRepository<TailArmamentImages, Long> {
    @Query("FROM TailArmamentImages where tail = ?1")
    TailArmamentImages findByTailId(Long tailId);
}
