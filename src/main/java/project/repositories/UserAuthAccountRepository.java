package project.repositories;

import project.entity.UserAuthAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAuthAccountRepository extends  CrudRepository<UserAuthAccount, Long> {



}
