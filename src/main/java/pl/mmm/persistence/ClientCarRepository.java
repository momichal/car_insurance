package pl.mmm.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mmm.model.entities.Car;

@Repository
public interface ClientCarRepository extends JpaRepository<Car, Long> {
    Car findClientCarById(long id);
}
