package tech.iwe.iwebackoffice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.iwe.iwebackoffice.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
    void deleteUserById(Long Id);
}
//JpaRepository has methods that will help us to make CRUD operations (save(), findAll()...)
//we will call them from UserService