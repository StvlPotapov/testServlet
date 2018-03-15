package repositories;

import entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

    List<User> findUserByLastName(String lastName); //попытка воспользоваться ключевыми словами Spring

}
