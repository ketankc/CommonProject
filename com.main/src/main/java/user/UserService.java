package user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserService extends JpaRepository<TblUser, Long>{

}
