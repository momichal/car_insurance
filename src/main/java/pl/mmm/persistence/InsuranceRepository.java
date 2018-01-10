package pl.mmm.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mmm.model.entities.Insurance;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Long> {

    void findInsuranceById(long id);

}
