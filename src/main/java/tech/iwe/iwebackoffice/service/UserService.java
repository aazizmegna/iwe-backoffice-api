package tech.iwe.iwebackoffice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.iwe.iwebackoffice.model.User;
import tech.iwe.iwebackoffice.repo.UserRepo;

import java.util.List;

@Service
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    // From here we can start our CRUD operations

    public User addUser(User user){
        user.setRole("Consumer");
        return userRepo.save(user);
    }

    public List<User> findAllUsers(){
        return userRepo.findAll();
    }

    public User updateUser(User user){
        return userRepo.save(user);
    }
    public void deleteUser(Long id){
        userRepo.deleteUserById(id);
    }
}
