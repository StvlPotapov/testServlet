package repositories;

import entity.UserPaymentMethod;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPaymentMethodRepository extends CrudRepository<UserPaymentMethod, Long> {

}
