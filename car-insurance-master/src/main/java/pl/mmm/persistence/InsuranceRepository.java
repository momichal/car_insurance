package pl.mmm.persistence;

import pl.mmm.model.entities.Insurance;
import org.springframework.data.repository.CrudRepository;

public interface InsuranceRepository extends CrudRepository<Insurance,Long> {
    Insurance getInsuranceById(long id);

    void saveInsurance(Insurance insurance);

}
